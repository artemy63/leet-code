package org.artemy63.leetcode_problems.arrays;

/**
 * https://leetcode.com/problems/sum-of-two-integers/submissions/
 *
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 * <p>
 * Input: a = 2, b = 3
 * Output: 5
 * <p>
 * Constraints:
 * -1000 <= a, b <= 1000
 */
public class LeetCode371 {

    public static int sumOf(int a, int b) {
        return approachTwo(a, b);
    }

    /**
     * as noticed ln(e^a * e^b) == ln(e^(a + b)) == (a + b)
     * <p>
     * выход за границы int при попытке вычислить e^999
     */
    private static int approachOne(int a, int b) {
        return (int) Math.log(Math.exp(a) * Math.exp(b));
    }

    /**
     * as noticed ln(e^(1/a) * e^(1/b)) == ln(e^(1/a + 1/b)) == 1/a +1/b == (a + b)/ab
     * => a + b == ab * ln(e^(1/a) * e^(1/b))
     */
    private static int approachTwo(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return (int) (Math.round(Math.log(Math.exp(Math.pow(a, -1)) * Math.exp(Math.pow(b, -1))) * a * b));
    }
}
