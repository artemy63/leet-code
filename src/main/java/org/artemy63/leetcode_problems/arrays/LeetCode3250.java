package org.artemy63.leetcode_problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 *
 * More formally check if there exists two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 * Example 2:
 *
 * Input: arr = [7,1,14,11]
 * Output: true
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
 * Example 3:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 *
 * Input: arr = [[-2,0,10,-19,4,6,-8]]
 * Output: false
 */
public class LeetCode3250 {

    public static void main(String[] args) {
        int[] sourceArr = {10, 2, 5, 3};
        System.out.println(checkIfExist(sourceArr));

        int[] sourceArr2 = {7, 1, 14, 11};
        System.out.println(checkIfExist(sourceArr2));

        int[] sourceArr3 = {3, 1, 7, 11};
        System.out.println(checkIfExist(sourceArr3));

        int[] sourceArr4 = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(sourceArr4));

        int[] sourceArr5 = {0, 0};
        System.out.println(checkIfExist(sourceArr5));

    }

    public static boolean checkIfExist(int[] arr) {
        System.out.println("source array " + Arrays.toString(arr));

        //keep in hash table all elements for fast search
        Map<Integer, Integer> elem2Indx = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            //border case: source array contains two zero elements
            if (arr[i] == 0 && elem2Indx.containsKey(arr[i])) {
                return true;
            }

            elem2Indx.put(arr[i], i);
        }

        for (int i = 1; i < arr.length; i++) {
            if (elem2Indx.containsKey(2 * arr[i]) && i != elem2Indx.get(2 * arr[i])) {
                return true;
            }

            if (arr[i] % 2 == 0 && elem2Indx.containsKey(arr[i] / 2) && i != elem2Indx.get(arr[i] / 2)) {
                return true;
            }
        }

        return false;
    }
}
