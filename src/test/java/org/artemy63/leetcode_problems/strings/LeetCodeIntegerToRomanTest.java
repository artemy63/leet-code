package org.artemy63.leetcode_problems.strings;

import org.junit.Assert;
import org.junit.Test;


public class LeetCodeIntegerToRomanTest {

    @Test
    public void intToRomanTest() {

        Assert.assertEquals("III", LeetCodeIntegerToRoman.intToRoman(3));
        Assert.assertEquals("IV", LeetCodeIntegerToRoman.intToRoman(4));
        Assert.assertEquals("IX", LeetCodeIntegerToRoman.intToRoman(9));
        Assert.assertEquals("LVIII", LeetCodeIntegerToRoman.intToRoman(58));
        Assert.assertEquals("MCMXCIV", LeetCodeIntegerToRoman.intToRoman(1994));
    }
}