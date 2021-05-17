package org.artemy63.leetcode_problems.strings;

/**
 * EASY
 *
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 *
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 */
public class LeetCode1108 {

    public static String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder(address.length() + 6);
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append('[').append('.').append(']');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
