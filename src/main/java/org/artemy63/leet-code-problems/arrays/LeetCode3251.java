package org.artemy63.arrays;

import java.util.Arrays;
import java.util.Map;

/**
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 *
 * Recall that A is a mountain array if and only if:
 *
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 * Example 1:
 * Input: [2,1]
 * Output: false
 *
 * Example 2:
 * Input: [3,5,5]
 * Output: false
 *
 * Example 3:
 * Input: [0,3,2,1]
 * Output: true
 */
public class LeetCode3251 {
    public static void main(String[] args) {
        int[] sourceArray = {2, 1};
        System.out.println(validMountainArray(sourceArray));

        int[] sourceArray2 = {3, 5, 5};
        System.out.println(validMountainArray(sourceArray2));

        int[] sourceArray3 = {0, 3, 2, 1};
        System.out.println(validMountainArray(sourceArray3));

        int[] sourceArray4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(validMountainArray(sourceArray4));

        int[] sourceArray5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(validMountainArray(sourceArray5));

        int[] sourceArray11 = {2, 1};
        System.out.println(anotherPossibleSolution(sourceArray11));

        int[] sourceArray21 = {3, 5, 5};
        System.out.println(anotherPossibleSolution(sourceArray21));

        int[] sourceArray31 = {0, 3, 2, 1};
        System.out.println(anotherPossibleSolution(sourceArray31));

        int[] sourceArray41 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(anotherPossibleSolution(sourceArray41));

        int[] sourceArray51 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(anotherPossibleSolution(sourceArray51));

    }

    public static boolean validMountainArray(int[] sourceArray) {
        System.out.println("source array " + Arrays.toString(sourceArray));

        if (sourceArray.length < 3) {
            return false;
        }

        boolean isExtremumFound = false;
        boolean isDecreasing = false;
        for (int i = 1; i < sourceArray.length; i++) {
            //strictly increasing/decreasing requires
            if (sourceArray[i] == sourceArray[i - 1]) {
                return false;
            }

            if (isExtremumFound) {
                //if after extremum point we have another extremum - it is not our case
                if (sourceArray[i] > sourceArray[i - 1]) {
                    return false;
                }
            } else {
                //at least one time next element should be bigger than previous
                if (sourceArray[i] > sourceArray[i - 1]) {
                    isDecreasing = true;
                }

                if (sourceArray[i] < sourceArray[i - 1]) {
                    isExtremumFound = true;
                }
            }
        }

        return isDecreasing && isExtremumFound;
    }

    public static boolean anotherPossibleSolution(int[] sourceArray) {
        System.out.println("source array " + Arrays.toString(sourceArray));

        //go up
        int i = 0;
        while (i < sourceArray.length - 1 && sourceArray[i] < sourceArray[i + 1]) {
            i++;
        }

        //peak can't be first or last
        if (i == 0 || i == sourceArray.length - 1) {
            return false;
        }

        //walk down
        while (i < sourceArray.length - 1 && sourceArray[i] > sourceArray[i + 1]) {
            i++;
        }

        return i == sourceArray.length - 1;

    }

}
