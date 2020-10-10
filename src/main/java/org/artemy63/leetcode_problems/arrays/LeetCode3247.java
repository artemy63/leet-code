package org.artemy63.leetcode_problems.arrays;

import java.util.Arrays;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Given nums = [3,2,2,3], val = 3,
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 2.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * <p>
 * <p>
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * <p>
 * Note that the order of those five elements can be arbitrary.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 * <p>
 * Input : [1], 1
 */
public class LeetCode3247 {

    public static void main(String[] args) {
        int[] sourceArr = {3, 2, 2, 3};
        int valueToRemove = 3;

        removeElement(sourceArr, valueToRemove);

        int[] sourceArr2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int valueToRemove2 = 2;

        removeElement(sourceArr2, valueToRemove2);

        int[] sourceArr3 = {4};
        int valueToRemove3 = 4;

        removeElement(sourceArr3, valueToRemove3);

        int[] sourceArr4 = {5, 5};
        int valueToRemove4 = 5;

        removeElement(sourceArr4, valueToRemove4);

        int[] sourceArr5 = {4, 5};
        int valueToRemove5 = 5;

        removeElement(sourceArr5, valueToRemove5);
    }

//    public static int removeElement(int[] nums, int val) {
//        System.out.println("source array :: " + Arrays.toString(nums));
//
//        //last element of source array, will be shifted with found element that equals to removed
//        int i = 0;
//        int k = nums.length - 1;
//
//        while (i <= k) {
//            if (nums[i] == val) {
//                //if in the tail we also have elements == elementToRemove
//                while (nums[k] == val && i < k) {
//                    k--;
//                }
//
//                if (nums[k] != val) {
//                    nums[i] = nums[k];
//                    k--;
//                } else {
//                    break;
//                }
//            }
//            i++;
//        }
//
//        System.out.println("index :: " + i + " modified array :: " + Arrays.toString(nums));
//        return i;
//    }

    //more simple way to solve it, looked in other solutions, not taking element from the tail, just not to write it
    public static int removeElement(int[] nums, int val) {
        System.out.println("source array :: " + Arrays.toString(nums));
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer++] = nums[i];
            }

        }
        System.out.println("index :: " + pointer + " modified array :: " + Arrays.toString(nums));
        return pointer;
    }
}
