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
    //method 1: dp
    //time: O(n^2) space: O(n^2)
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String res = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1]);
                if (dp[i][j]) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        res = s.substring(i, j+ 1);
                    }
                }

            }
        }
        return res;
    }

    //method 2: symmetrical from the center
    //time: O(n^2) space: O(1)
    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        int start = 0, maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i, start, maxLength);
            helper(s, i, i + 1, start, maxLength);
        }
        return s.substring(start, maxLength);
    }

    private void helper(String s, int left, int right, int start, int maxLength) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLength < right - left - 1) {
            start = left + 1;
            maxLength = right - left - 1;
        }
    }

}
