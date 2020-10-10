package org.artemy63.algorithm.fast_sorting;

/**
 * Алгоритм быстрой сортировки
 */
public class AlgorithmFastSorting {

    public static void quickSort(int[] sourceArray) {
        quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        if (array.length == 0){
            return;
        }

        if (leftBorder >= rightBorder)
            return;

        int middle = leftBorder + (rightBorder - leftBorder) / 2;
        int opora = array[middle];

        int i = leftBorder, j = rightBorder;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (leftBorder < j)
            quickSort(array, leftBorder, j);

        if (rightBorder > i)
            quickSort(array, i, rightBorder);
    }
}
