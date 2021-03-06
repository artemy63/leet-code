package org.artemy63.algorithm.bubble_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlgorithmBubbleSortingTest {

    @Test
    public void testSortAlreadySortedArray() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberOfOperations = AlgorithmBubbleSorting.bubbleSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertEquals(8, numberOfOperations);
    }

    @Test
    public void testSortReversSortedArray() {
        int[] sourceArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int numberOfOperations = AlgorithmBubbleSorting.bubbleSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertEquals(8 + 7 + 6 + 5 + 4 + 3 + 2 + 1, numberOfOperations);
    }

    @Test
    public void testSortRandomArray() {
        int[] sourceArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int numberOfOperations = AlgorithmBubbleSorting.bubbleSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertTrue(8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 > numberOfOperations);
    }
}