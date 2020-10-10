package org.artemy63.arrays;

import java.util.Arrays;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 * <p>
 * Note that elements beyond the length of the original array are not written.
 * <p>
 * Do the above modifications to the input array in place, do not return anything from your function.
 * <p>
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * <p>
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 * Input: [0,4,1,0,0,8,0,0,3]
 * Output: [0,0,4,1,0,0,0,0,8]
 */
public class LeetCode3245 {

    public static void main(String[] args) {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(input);

        int[] input2 = {0,4,1,0,0,8,0,0,3};
        duplicateZeros(input2);
    }

    public static void duplicateZeros(int[] arr) {
        System.out.println("source array :: " + Arrays.toString(arr));
        boolean isPreviousShifted = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                isPreviousShifted = false;
                continue;
            }

            if (isPreviousShifted) {
                isPreviousShifted = false;
                continue;
            }

            for (int j = arr.length - 1; j > i; j--) {
                arr[j] = arr[j - 1];
            }
            isPreviousShifted = true;
        }

        System.out.println("modified array :: " + Arrays.toString(arr));
    }
}
