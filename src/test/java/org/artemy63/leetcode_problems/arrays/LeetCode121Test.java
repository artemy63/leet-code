package org.artemy63.leetcode_problems.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode121Test {

    @Test
    public void doTest() {
        int[] inputPrices = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(5, LeetCode121.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest2() {
        int[] inputPrices = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, LeetCode121.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest3() {
        int[] inputPrices = {};
        Assert.assertEquals(0, LeetCode121.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest4() {
        int[] inputPrices = {1, 2, 3, 4, 5, 5, 5, 5, 6};
        Assert.assertEquals(5, LeetCode121.solveTheProblem(inputPrices));
    }

}
