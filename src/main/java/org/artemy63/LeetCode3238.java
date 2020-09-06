package org.artemy63;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 *     The maximum number of consecutive 1s is 3.
 *
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */
public class LeetCode3238 {

    public static void main(String[] args) {
        int[] input = {1,1,0,1,1,1};

        int maxConsecutiveOnes = findMaxConsecutiveOnes(input);
        System.out.println(maxConsecutiveOnes);

        int[] input2 = {1,1,1,1,1,0,1,0,1,0,1,0,0,0,0,1,1,1,1,1,1};

        int maxConsecutiveOnes2 = findMaxConsecutiveOnes(input2);
        System.out.println(maxConsecutiveOnes2);
    }

    public static int findMaxConsecutiveOnes(int[] input) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        for (int value : input) {
            if (value == 1) {
                currentConsecutiveOnes++;
            } else if (value == 0) {
                if (currentConsecutiveOnes > maxConsecutiveOnes) {
                    maxConsecutiveOnes = currentConsecutiveOnes;
                }
                currentConsecutiveOnes = 0;
            }
        }
        //case when input array ends with 1
        if (currentConsecutiveOnes > maxConsecutiveOnes) {
            maxConsecutiveOnes = currentConsecutiveOnes;
        }

        return maxConsecutiveOnes;
    }
}
