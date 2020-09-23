package org.artemy63.arrays;

import java.util.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 *
 * Given nums = [1,1,2],
 *
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 */
public class LeetCode3248 {

    public static void main(String[] args) {
        int[] sourceArr = {1, 1, 2};
        System.out.println(removeDuplicates(sourceArr));

        int[] sourceArr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(sourceArr2));

        int[] sourceArr3 = {77};
        System.out.println(removeDuplicates(sourceArr3));

        int[] sourceArr4 = {77, 79, 81};
        System.out.println(removeDuplicates(sourceArr4));

        int[] sourceArr5 = {};
        System.out.println(removeDuplicates(sourceArr5));
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println("source array " + Arrays.toString(nums));
        if (nums.length <= 1) {
            return nums.length;
        }

        int pointer = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pointer]) {
                nums[++pointer] = nums[i];
            }
        }

        System.out.println("modified array " + Arrays.toString(nums));
        return pointer + 1;
    }
}
