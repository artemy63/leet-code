package org.artemy63.algorithm.fast_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlgorithmFastSortingTest {
    @Test
    public void testSortAlreadySortedArray() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        AlgorithmFastSorting.quickSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
    }

    @Test
    public void testSortReversSortedArray() {
        int[] sourceArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        AlgorithmFastSorting.quickSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
    }

    @Test
    public void testSortRandomArray() {
        int[] sourceArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        AlgorithmFastSorting.quickSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
    }

    @Test
    public void testSortRandomDuplicatesArray() {
        int[] sourceArray = {5, 9, 3, 1, 5, 2, 2, 8, 4, 7, 6, 1, 9};
        AlgorithmFastSorting.quickSort(sourceArray);

        Assert.assertEquals("[1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9]", Arrays.toString(sourceArray));
    }
}