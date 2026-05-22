package com.company.naturaladabascli;

import com.company.naturaladabascli.cli.SourceType;
import com.company.naturaladabascli.cli.SourceTypeDetector;
import org.junit.Assert;
import org.junit.Test;

public class SourceTypeDetectionTest {

    @Test
    public void infersGitFromGithubHttps() {
        Assert.assertEquals(SourceType.GIT,
                SourceTypeDetector.detect("https://github.com/org/repo", SourceType.AUTO));
    }

    @Test
    public void infersZipUrl() {
        Assert.assertEquals(SourceType.ZIP_URL,
                SourceTypeDetector.detect("https://example.com/a.zip", SourceType.AUTO));
    }

    @Test
    public void infersZipFile() {
        Assert.assertEquals(SourceType.ZIP_FILE,
                SourceTypeDetector.detect("./samples/natural-adabas.zip", SourceType.AUTO));
    }

    @Test
    public void explicitOverridesAuto() {
        Assert.assertEquals(SourceType.ZIP_URL,
                SourceTypeDetector.detect("https://github.com/x/y.zip", SourceType.ZIP_URL));
    }
}
