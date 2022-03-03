package org.artemy63.leetcode_problems.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode371Test {

    @Test
    public void doTest() {
        Assert.assertEquals(3, LeetCode371.sumOf(1, 2));
        Assert.assertEquals(5, LeetCode371.sumOf(2, 3));
        Assert.assertEquals(15, LeetCode371.sumOf(7, 8));
        Assert.assertEquals(2, LeetCode371.sumOf(1, 1));
        Assert.assertEquals(2, LeetCode371.sumOf(1, 1));
        Assert.assertEquals(1, LeetCode371.sumOf(0, 1));
        Assert.assertEquals(0, LeetCode371.sumOf(0, 0));
        Assert.assertEquals(42, LeetCode371.sumOf(21, 21));
        Assert.assertEquals(-999, LeetCode371.sumOf(0, -999));
        Assert.assertEquals(999, LeetCode371.sumOf(999, 0));
        Assert.assertEquals(1, LeetCode371.sumOf(999, -998));
    }
}
