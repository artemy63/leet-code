package org.artemy63.leetcode_problems.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * MEDIUM
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 */
public class LeetCode6 {

    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean directionDown = false;

        for (char curChar : s.toCharArray()) {
            rows.get(currentRow).append(curChar);
            if (currentRow == 0 || currentRow == numRows - 1) {
                directionDown = !directionDown;
            }
            currentRow += directionDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
