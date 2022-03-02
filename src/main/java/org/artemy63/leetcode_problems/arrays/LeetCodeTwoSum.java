package org.artemy63.leetcode_problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/solution/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Constraints:
 *
 * 2 <= nums.length <= 10^4
 * -109 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class LeetCodeTwoSum {

    public static int[] twoSum(int[] sourceArr, int target) {
        return approachTwo(sourceArr, target);
    }

    /**
     * first native implementation
     * iterate over nums, in inner loop iterate over nums again and compare (a[i] + a[j]) and target , if matches return [i, j]
     * time complexity O(n^2)
     * space complexity O(1)
     */
    private static int[] approachOne(int[] sourceArr, int target) {
        if (sourceArr.length == 2) {
            if (sourceArr[0] + sourceArr[1] == target) {
                return new int[]{0, 1};
            } else {
                throw new IllegalArgumentException("wrong input params");
            }
        }

        for (int i = 0; i < sourceArr.length - 1; i++) {
            for (int j = i + 1; j < sourceArr.length; j++) {
                if (sourceArr[i] + sourceArr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalStateException("wrong input params");
    }

    /**
     *  бежим по исходному массиву, сравниваем target и текущее значение в массиве, diff кладём в мапу с ключом diff и значением "текущий индекс массива"
     *  если последующий элемент содержится в нашей мапе, это означает, что как раз его и не хватает до target, пора возвращать индекс того элемента, который лежит в мапе и текущий индекс
     *
     *  time complexity O(n)
     *  space complexity O(n)
     */
    private static int[] approachTwo(int[] sourceArr, int target) {
        if (sourceArr.length == 2) {
            if (sourceArr[0] + sourceArr[1] == target) {
                return new int[]{0, 1};
            } else {
                throw new IllegalArgumentException("wrong input params");
            }
        }

        Map<Integer, Integer> diff2Index = new HashMap<>(sourceArr.length);
        for (int i = 0; i < sourceArr.length; i++) {
            if (diff2Index.containsKey(sourceArr[i])) {
                return new int[]{diff2Index.get(sourceArr[i]), i};
            } else {
                diff2Index.put(target - sourceArr[i], i);
            }
        }

        throw new IllegalStateException("wrong input params");
    }
}
