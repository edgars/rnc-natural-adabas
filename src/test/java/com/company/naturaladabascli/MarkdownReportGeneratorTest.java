package com.company.naturaladabascli;

import com.company.naturaladabascli.cli.SourceType;
import com.company.naturaladabascli.model.AnalysisResult;
import com.company.naturaladabascli.model.ArtifactType;
import com.company.naturaladabascli.model.LegacyEntity;
import com.company.naturaladabascli.model.LegacyField;
import com.company.naturaladabascli.model.LegacyProgram;
import com.company.naturaladabascli.model.ParseStatus;
import com.company.naturaladabascli.model.SourceArtifact;
import com.company.naturaladabascli.report.MarkdownReportGenerator;
import com.company.naturaladabascli.semantic.CrudMatrixBuilder;
import org.junit.Assert;
import org.junit.Test;

public class MarkdownReportGeneratorTest {

    @Test
    public void reportContainsExecutiveSummary() {
        AnalysisResult r = new AnalysisResult();
        r.setSource("./samples");
        r.setSourceType(SourceType.ZIP_FILE);
        r.setStartedAt(1L);
        r.setFinishedAt(2L);

        SourceArtifact a = new SourceArtifact();
        a.setRelativePath("CLIENTE.DDM");
        a.setArtifactType(ArtifactType.NATURAL_DDM);
        a.setEncoding("UTF-8");
        a.setParseStatus(ParseStatus.OK);
        r.getArtifacts().add(a);

        LegacyEntity e = new LegacyEntity();
        e.setName("CLIENTE");
        LegacyField f = new LegacyField();
        f.setName("CPF");
        f.setType("A");
        f.setLength(11);
        e.getFields().add(f);
        r.getEntities().add(e);

        LegacyProgram p = new LegacyProgram();
        p.setName("P1");
        p.setRelativePath("P1.NSN");
        r.getPrograms().add(p);

        CrudMatrixBuilder.build(r);

        String md = new MarkdownReportGenerator().generate(r);
        Assert.assertTrue(md.contains("## 1. Executive Summary"));
        Assert.assertTrue(md.contains("## 5. CRUD Matrix"));
    }
}
