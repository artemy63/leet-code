package org.artemy63.leetcode_problems.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class LeetCode549 {

    public static void main(String[] args) {
        int[] sourceArr = {2, 2, 1};
        System.out.println(singleNumber(sourceArr));

        int[] sourceArr2 = {4,1,2,1,2};
        System.out.println(singleNumber(sourceArr2));

        int[] sourceArr3 = {2, 2, 1};
        System.out.println(singleNumber2(sourceArr3));

        int[] sourceArr4 = {4,1,2,1,2};
        System.out.println(singleNumber2(sourceArr4));
    }

    /**
     * this approach used hash map
     * Time complexity : O(n * 1) = O(n). Time complexity of for loop is O(n). Time complexity of hash table(dictionary in python) operation pop is O(1).
     *
     * Space complexity : O(n). The space required by hash table is equal to the number of elements in nums
     */
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> num2count = new HashMap<Integer, Integer>();

        for (int num : nums) {
            num2count.put(num, num2count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : num2count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        throw new IllegalArgumentException("There is no element which exist in once");
    }

    /**
     * approach with XOR
     * The A XOR B operation is equivalent to (A AND !B) OR (!A AND B)
     *
     * If we take XOR of zero and some bit, it will return that bit: a ^ 0 == a
     * If we take XOR of two same bits, it will return 0: a ^ a == 0
     * a ^ b ^ a == (a ^ a) ^ b == 0 ^ b = b
     *
     * Time complexity : O(n). We only iterate through nums, so the time complexity is the number of elements in nums.
     *
     * Space complexity : O(1).
     */
    public static int singleNumber2(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
