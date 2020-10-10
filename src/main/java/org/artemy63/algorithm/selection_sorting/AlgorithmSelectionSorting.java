package org.artemy63.algorithm.selection_sorting;

/**
 * Сортировка выбором
 *
 * находим номер минимального значения в текущем списке
 * производим обмен этого значения со значением первой неотсортированной позиции (обмен не нужен, если минимальный элемент уже находится на данной позиции)
 * теперь сортируем хвост списка, исключив из рассмотрения уже отсортированные элементы
 *
 * Сложность алгоритма: O(n^2)
 */
public class AlgorithmSelectionSorting {

    public static int selectionSort(int[] sourceArray) {
        if (sourceArray.length == 0) {
            return 0;
        }

        int numberOfOperations = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            int min = sourceArray[i];
            int minIdx = i;
            for (int j = i; j < sourceArray.length; j++) {
                numberOfOperations++;
                if (min > sourceArray[j]) {
                    min = sourceArray[j];
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int swap = sourceArray[i];
                sourceArray[i] = min;
                sourceArray[minIdx] = swap;
            }
        }

        return numberOfOperations;
    }
}
