package com.leetcode;

public class RotateString {
    public boolean rotateString(String A, String B) {
        char[] arrayA = A.toCharArray();
        char[] arrayB = B.toCharArray();
        int i = 0;
        for (; i < arrayB.length; i++) {
            if (arrayB[i] == arrayA[0]) {
                break;
            }
        }
        for (int j = 0; j < arrayA.length - i; j++) {
            if (arrayA[j] != arrayB[j + i]) {
                return false;
            }
            if (arrayA[j + i - 1] != arrayB[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RotateString s = new RotateString();
        String A = "abcde";
        String B = "cdeab";
        System.out.println(s.rotateString("abcde", "cdeab"));
    }
}
