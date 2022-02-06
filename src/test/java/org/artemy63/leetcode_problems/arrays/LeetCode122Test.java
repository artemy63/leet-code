package org.artemy63.leetcode_problems.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode122Test {

    @Test
    public void doTest() {
        int[] inputPrices = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, LeetCode122.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest2() {
        int[] inputPrices = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, LeetCode122.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest3() {
        int[] inputPrices = {};
        Assert.assertEquals(0, LeetCode122.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest4() {
        int[] inputPrices = {1, 2, 3, 4, 5, 5, 5, 5, 6};
        Assert.assertEquals(5, LeetCode122.solveTheProblem(inputPrices));
    }

    @Test
    public void doTest5() {
        int[] inputPrices = {1, 7, 2, 3, 6, 7, 6, 7};
        Assert.assertEquals(12, LeetCode122.solveTheProblem(inputPrices));
    }

}
