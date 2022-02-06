package org.artemy63.leetcode_problems.arrays;

/**
 * Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class LeetCode121 {

    /**
     * Решение получается за один проход по элемнтам массива, оценка по времени O(n), space complexity is O(1)
     *
     * На каждом проходе мы сравниваем текущий элемент с текущим минимальным значением, если текущий элемент меньше, просто меняем текущий минимальный элемент.
     * Если минимальный элемент не поменялся, надежда на прибыль есть, сравниваем разницу между текущим элементом и минимальным(возможный профит) с текущим профитом.
     */
    public static int solveTheProblem(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (profit < prices[i] - minPrice) {
                profit = prices[i] - minPrice;
            }
        }

        return profit;
    }
}
