package org.artemy63.leetcode_problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 * <p>
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 * <p>
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 * <p>
 * Input: [1,2,3,4]
 * Output: "23:41
 * <p>
 * Input: [5,5,5,5]
 * Output: ""
 *
 * Input: [2,0,6,6]
 * Output: 06:26
 */

public class LeetCode554 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(largestTimeFromDigits(input));

        int[] input2 = {5, 0, 4, 2};
        System.out.println(largestTimeFromDigits(input2));

        int[] input3 = {5, 5, 5, 5};
        System.out.println(largestTimeFromDigits(input3));

        int[] input4 = {0, 4, 0, 0};
        System.out.println(largestTimeFromDigits(input4));
    }

    private static String largestTimeFromDigits(int[] input) {
        //find first element
        int zeroElementIndex = -1;
        int zeroElement = -1;
        for (int i = 0; i < input.length; i++) {
            int candidate = input[i];
            if (0 <= candidate && candidate <= 2 && zeroElement <= candidate) {
                zeroElementIndex = i;
                zeroElement = candidate;
            }
        }

        int[] result = {zeroElement, -1, -1, -1};
        int candidate = -1;
        int buffer;
        for (int i = 0; i < input.length; i++) {
            if (i == zeroElementIndex) {
                continue;
            }

            candidate = input[i];
            if (0 <= candidate
                    && (zeroElement < 2 || (zeroElement == 2 && candidate <= 3 ))
                    && candidate > result[1]) {
                buffer = result[1];
                result[1] = candidate;
                candidate = buffer;
            }

            if (0 <= candidate && candidate <= 5 && candidate > result[2]) {
                buffer = result[2];
                result[2] = candidate;
                candidate = buffer;
            }

            if (0 <= candidate) {
                result[3] = candidate;
            }
        }

        String time = "";
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                return "";
            }
            time += result[i];
            if (i == 1) {
                time += ":";
            }
        }

        return time;
    }

//    //not correct working, does not consider 04:00; 18:54
//    private static String largestTimeFromDigits(int[] input) {
//        //-1 point that we did not find proper values
//        int[] result = {-1, -1, -1, -1};
//        int candidate = -1;
//        int buffer;
//        for (int i = 0; i < input.length; i++) {
//            int value = input[i];
//            candidate = value;
//            if (0 <= candidate && candidate <= 2 && candidate > result[0]) {
//                buffer = result[0];
//                result[0] = candidate;
//                candidate = buffer;
//            }
//
//            if (0 <= candidate && candidate <= 3 && candidate > result[1]) {
//                buffer = result[1];
//                result[1] = candidate;
//                candidate = buffer;
//            }
//
//            if (0 <= candidate && candidate <= 5 && candidate > result[2]) {
//                buffer = result[2];
//                result[2] = candidate;
//                candidate = buffer;
//            }
//
//            if (0 <= candidate) {
//                result[3] = candidate;
//            }
//            System.out.println("iteration " + i + " result = [" + result[0] + "," + result[1] + "," + result[2] + "," + result[3] + "]");
//        }
//
//        String time = "";
//        for (int i = 0; i < result.length; i++) {
//            if (result[i] < 0) {
//                return "";
//            }
//            time += result[i];
//            if (i == 1) {
//                time += ":";
//            }
//        }
//
//        return time;
//    }
}
