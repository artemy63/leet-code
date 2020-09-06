package org.artemy63;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 10^5
 */
public class LeetCode3237 {

    public static void main(String[] args) {
        int[] input = {12, 345, 2, 6, 7896};
        int result = findNumbers(input);
        System.out.println(result);

        int[] input2 = {555,901,482,1771};
        int result2 = findNumbers(input2);
        System.out.println(result2);
    }

    public static int findNumbers(int[] input) {
        int result = 0;
        for (int i : input) {
            result += defineNumberOfDigits(i);
        }

        return result;
    }

    private static int defineNumberOfDigits(int someNumber) {
        if (someNumber < 10) {
            return 0;
        }

        int numberOfDigits = 1;
        do {
            someNumber = someNumber / 10;
            numberOfDigits++;
        } while (someNumber >= 10);

        return numberOfDigits % 2 == 0 ? 1 : 0;
    }
}
