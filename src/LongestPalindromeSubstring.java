package com.leetcode;

public class LongestPalindromeSubstring {
    /**
     * 5. Longest Palindrome Substring
     * Given a string s, find the longest palindromic substring in s
     * You may assume that the maximum length of s is 1000


     Example:

     Input: "babad"
     i j
     Output: "bab"

     j = 4, i = 2;

     * @param
     * @return
     */

    //time: O(n^2) space: O(n^2)
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
            }
        }
    }


}
