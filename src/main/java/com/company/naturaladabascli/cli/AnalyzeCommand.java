package com.company.naturaladabascli.cli;

import com.company.naturaladabascli.drivers.natural.NaturalAdabasAnalyzer;
import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.ArtifactType;
import com.company.naturaladabascli.model.SourceArtifact;
import com.company.naturaladabascli.report.MarkdownReportGenerator;
import com.company.naturaladabascli.scanner.SourceScanner;
import com.company.naturaladabascli.semantic.SemanticModelBuilder;
import com.company.naturaladabascli.source.GitSourceResolver;
import com.company.naturaladabascli.source.SourceResolver;
import com.company.naturaladabascli.source.WorkspaceManager;
import com.company.naturaladabascli.source.ZipFileSourceResolver;
import com.company.naturaladabascli.source.ZipUrlSourceResolver;
import com.company.naturaladabascli.util.ConsoleLogger;
import com.company.naturaladabascli.util.FileUtils;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/**
 * End-to-end analysis command: resolve source, scan, parse, report.
 */
@Command(name = "analyze", description = "Analyze Natural/Adabas sources and emit a Markdown report.")
public class AnalyzeCommand implements Callable<Integer> {

    @Option(names = {"--source", "-s"}, required = true, description = "GitHub URL, ZIP URL, local ZIP path, or repository path.")
    private String source;

    @Option(names = {"--type", "-t"}, description = "git | zip-url | zip-file | auto (default: auto)")
    private SourceType type = SourceType.AUTO;

    @Option(names = {"--output", "-o"}, required = true, description = "Output Markdown file path.")
    private Path output;

    @Option(names = "--keep-workspace", description = "Keep temporary workspace under .natural-analyzer-workspace")
    private boolean keepWorkspace;

    @Override
    public Integer call() throws Exception {
        ConsoleLogger log = new ConsoleLogger();
        log.banner("Natural/Adabas CLI Analyzer");
        log.info("Iniciando análise");
        log.info("Detectando tipo da origem");

        SourceType resolved = SourceTypeDetector.detect(source, type);
        log.info("Source: " + source);
        log.info("Mode: " + resolved.name().toLowerCase(Locale.ROOT));

        log.step(1, 7, "Preparing workspace...");
        WorkspaceManager wm = new WorkspaceManager();
        String ts = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS", Locale.ROOT).format(new Date());
        Path workspace = wm.createWorkspace(wm.defaultBaseDir(), ts);

        Path extractedRoot = null;
        try {
            log.step(2, 7, "Fetching source...");
            log.info(resolved == SourceType.GIT ? "Clonando repositório" : "Baixando ou extraindo ZIP");
            extractedRoot = resolveSource(workspace, resolved);

            log.step(3, 7, "Scanning files...");
            log.info("Extraindo arquivos");
            log.info("Identificando arquivos Natural/DDM");
            SourceScanner scanner = new SourceScanner();
            List<SourceArtifact> artifacts = scanner.scan(extractedRoot);

            AnalysisResult result = new AnalysisResult();
            result.setSource(source);
            result.setSourceType(resolved);
            result.setStartedAt(System.currentTimeMillis());
            result.getArtifacts().addAll(artifacts);

            log.step(4, 7, "Parsing DDM files...");
            log.info("Executando parser");
            NaturalAdabasAnalyzer analyzer = new NaturalAdabasAnalyzer();
            for (SourceArtifact a : artifacts) {
                if (a.getArtifactType() == ArtifactType.NATURAL_DDM) {
                    analyzer.analyze(a, result);
                }
            }

            log.step(5, 7, "Parsing Natural programs...");
            for (SourceArtifact a : artifacts) {
                if (a.getArtifactType() == ArtifactType.NATURAL_PROGRAM
                        || a.getArtifactType() == ArtifactType.NATURAL_COPYCODE) {
                    analyzer.analyze(a, result);
                }
            }

            log.step(6, 7, "Building semantic model...");
            log.info("Extraindo modelo de dados");
            log.info("Extraindo acessos CRUD");
            log.info("Extraindo regras candidatas");
            new SemanticModelBuilder().build(result);

            result.setFinishedAt(System.currentTimeMillis());

            log.step(7, 7, "Generating Markdown report...");
            log.info("Gerando relatório Markdown");
            String markdown = new MarkdownReportGenerator().generate(result);
            Path outAbs = output.toAbsolutePath().normalize();
            FileUtils.writeString(outAbs, markdown, StandardCharsets.UTF_8);
            log.info("Caminho final do relatório: " + outAbs);

            log.info("");
            log.info("Analysis completed.");
            log.info("Programs found: " + result.getPrograms().size());
            log.info("DDMs found: " + countType(artifacts, ArtifactType.NATURAL_DDM));
            log.info("Data accesses found: " + result.getDataAccesses().size());
            log.info("Candidate business rules found: " + result.getBusinessRuleCandidates().size());
            log.info("Report generated at: " + outAbs);

            return 0;
        } finally {
            if (!keepWorkspace) {
                FileUtils.deleteDirectoryQuietly(workspace);
            }
        }
    }

    private Path resolveSource(Path workspace, SourceType resolved) throws Exception {
        List<SourceResolver> resolvers = Arrays.asList(
                new GitSourceResolver(),
                new ZipUrlSourceResolver(),
                new ZipFileSourceResolver());
        for (SourceResolver r : resolvers) {
            if (r.supports(source, resolved)) {
                return r.resolve(source, workspace);
            }
        }
        throw new IllegalStateException("No resolver for " + resolved);
    }

    private static int countType(List<SourceArtifact> artifacts, ArtifactType t) {
        int n = 0;
        for (SourceArtifact a : artifacts) {
            if (a.getArtifactType() == t) {
                n++;
            }
        }
        return n;
    }
}
