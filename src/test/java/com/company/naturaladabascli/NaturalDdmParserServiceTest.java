package com.company.naturaladabascli;

import com.company.naturaladabascli.model.ParseIssue;
import com.company.naturaladabascli.parser.NaturalDdmParserService;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaturalDdmParserServiceTest {

    @Test
    public void parsesSampleClienteDdm() throws Exception {
        String src = readResource("samples/CLIENTE.DDM");
        List<ParseIssue> issues = new ArrayList<ParseIssue>();
        NaturalDdmParserService svc = new NaturalDdmParserService();
        com.company.naturaladabascli.antlr.NaturalDdmParser.DdmFileContext tree = svc.parse(src, "CLIENTE.DDM", issues);
        Assert.assertNotNull(tree);
        Assert.assertTrue(issues.size() < 50);
    }

    private static String readResource(String path) throws Exception {
        InputStream in = NaturalDdmParserServiceTest.class.getClassLoader().getResourceAsStream(path);
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
