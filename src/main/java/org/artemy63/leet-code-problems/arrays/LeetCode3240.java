package org.artemy63.arrays;

import java.util.Arrays;

/**
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
 * <p>
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * <p>
 * <p>
 * Input: [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class LeetCode3240 {

    public static void main(String[] args) {
        int[] input = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(input);
        for (int i : result) {
            System.out.print(i + "   ");
        }
        System.out.println();

        int[] input2 = {-7,-3,2,3,11};
        int[] result2 = sortedSquares(input2);
        for (int i : result2) {
            System.out.print(i + "   ");
        }
    }

    public static int[] sortedSquares(int[] input) {
        int[] squares = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            squares[i] = input[i] * input[i];
        }
        Arrays.sort(squares);

        return squares;
    }
}
