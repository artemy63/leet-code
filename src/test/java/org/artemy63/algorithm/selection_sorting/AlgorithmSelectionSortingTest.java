package org.artemy63.algorithm.selection_sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AlgorithmSelectionSortingTest {
    @Test
    public void testSortAlreadySortedArray() {
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberOfOperations = AlgorithmSelectionSorting.selectionSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertEquals(45, numberOfOperations);
    }

    @Test
    public void testSortReversSortedArray() {
        int[] sourceArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int numberOfOperations = AlgorithmSelectionSorting.selectionSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertEquals(45, numberOfOperations);
    }

    @Test
    public void testSortRandomArray() {
        int[] sourceArray = {5, 9, 3, 1, 2, 8, 4, 7, 6};
        int numberOfOperations = AlgorithmSelectionSorting.selectionSort(sourceArray);

        Assert.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(sourceArray));
        Assert.assertEquals(45, numberOfOperations);
    }
}