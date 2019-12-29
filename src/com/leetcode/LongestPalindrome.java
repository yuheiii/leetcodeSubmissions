package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
    /**
     * 409. Longest Palindrome
     * Given a string which consists of lowercase or uppercase letters,
     * find the length of the longest palindromes that can be built with those letters.
     * This is case sensitive

     Example:

     Input: "abccccdd"
     i j
     Output: 7


     * @param
     * @return
     */

    //method 1: Set
    //time: O(n) space: O(n)

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }
        if (!set.isEmpty()) {
            return count * 2 + 1;
        } else {
            return count * 2;
        }
    }

    //method 2: greedy algorithm
    //time: O(n) space: O(1)
    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int res = 0;
        for (int i : count) {
            res += i / 2 * 2;
            if (res % 2 == 0 && i % 2 == 1) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestPalindrome s = new LongestPalindrome();
        int res = s.longestPalindrome("abccccdd");
        System.out.println(res);
    }
}
