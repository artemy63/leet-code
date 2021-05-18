package org.artemy63.leetcode_problems.strings;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode6Test {

    @Test
    public void doTest() {
        String sourceString = "PAYPALISHIRING";
        String converted = LeetCode6.convert(sourceString, 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", converted);
    }

    @Test
    public void doTestSecond() {
        String sourceString = "PAYPALISHIRING";
        String converted = LeetCode6.convert(sourceString, 1);
        Assert.assertEquals("PAYPALISHIRING", converted);
    }

    @Test
    public void doTestThird() {
        String sourceString = "PAYPALISHIRING";
        String converted = LeetCode6.convert(sourceString, 4);
        Assert.assertEquals("PINALSIGYAHRPI", converted);
    }
}
