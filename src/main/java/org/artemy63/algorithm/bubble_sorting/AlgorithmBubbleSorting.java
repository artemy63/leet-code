package org.artemy63.algorithm.bubble_sorting;

/**
 * Пузырьковая сортировка
 *
 * Алгоритм состоит из повторяющихся проходов по сортируемому массиву.
 * За каждый проход элементы последовательно сравниваются попарно и, если порядок в паре неверный, выполняется обмен элементов.
 * Проходы по массиву повторяются N-1 раз или до тех пор, пока на очередном проходе не окажется, что обмены больше не нужны,
 * что означает — массив отсортирован.
 * При каждом проходе алгоритма по внутреннему циклу, очередной наибольший элемент массива ставится на своё место в конце массива
 * рядом с предыдущим «наибольшим элементом», а наименьший элемент перемещается на одну позицию к началу массива
 * («всплывает» до нужной позиции, как пузырёк в воде — отсюда и название алгоритма).
 *
 * Сложность алгоритма: O(n^2)
 */
public class AlgorithmBubbleSorting {

    /**
     * provide bubble sorting, returns number of operations to solve the problem
     */
    public static int bubbleSort(int[] sourceArray) {
        if (sourceArray.length == 0) {
            return 0;
        }

        //holds number of operations
        int operationsCount = 0;
        for (int i = 1; i < sourceArray.length; i++) {
            boolean isSortingNeeded = false;
            for (int j = 0; j < sourceArray.length - i; j++) {
                operationsCount++;
                if (sourceArray[j] > sourceArray[j + 1]) {
                    int swap = sourceArray[j + 1];
                    sourceArray[j + 1] = sourceArray[j];
                    sourceArray[j] = swap;
                    isSortingNeeded = true;
                }
            }

            if (!isSortingNeeded) {
                //no need sort anymore, already sorted array
                return operationsCount;
            }
        }

        return operationsCount;
    }
}
