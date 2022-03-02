package org.artemy63.leetcode_problems.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeetCodeTwoSumTest {

    @Test
    public void testTwoSum() {
        Assert.assertArrayEquals(new int[]{0, 1}, LeetCodeTwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[]{1, 2}, LeetCodeTwoSum.twoSum(new int[]{3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[]{0, 1}, LeetCodeTwoSum.twoSum(new int[]{3, 3}, 6));
    }
}
