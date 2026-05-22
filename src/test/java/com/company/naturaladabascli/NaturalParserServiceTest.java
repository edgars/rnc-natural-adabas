package com.company.naturaladabascli;

import com.company.naturaladabascli.model.ParseIssue;
import com.company.naturaladabascli.parser.NaturalParserService;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaturalParserServiceTest {

    @Test
    public void parsesSampleConsultaCliente() throws Exception {
        String src = readResource("samples/CONSULTA_CLIENTE.NSN");
        List<ParseIssue> issues = new ArrayList<ParseIssue>();
        NaturalParserService svc = new NaturalParserService();
        com.company.naturaladabascli.antlr.NaturalParser.ProgramContext tree = svc.parse(src, "CONSULTA_CLIENTE.NSN", issues);
        Assert.assertNotNull(tree);
        Assert.assertTrue(issues.size() < 50);
    }

    private static String readResource(String path) throws Exception {
        InputStream in = NaturalParserServiceTest.class.getClassLoader().getResourceAsStream(path);
        Assert.assertNotNull(in);
        Scanner s = new Scanner(in, StandardCharsets.UTF_8.name()).useDelimiter("\\A");
        try {
            return s.hasNext() ? s.next() : "";
        } finally {
            s.close();
            in.close();
        }
    }
}
