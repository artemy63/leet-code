package org.artemy63.leetcode_problems.strings;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode1108Test {

    @Test
    public void doTest() {
        String defangIPaddr = LeetCode1108.defangIPaddr("123.24.7.42");
        Assert.assertEquals("123[.]24[.]7[.]42", defangIPaddr);
    }

    @Test
    public void doSecondTest() {
        String defangIPaddr = LeetCode1108.defangIPaddr("1.1.1.1");
        Assert.assertEquals("1[.]1[.]1[.]1", defangIPaddr);
    }

    @Test
    public void doThirdTest() {
        String defangIPaddr = LeetCode1108.defangIPaddr("255.100.50.0");
        Assert.assertEquals("255[.]100[.]50[.]0", defangIPaddr);
    }
}
