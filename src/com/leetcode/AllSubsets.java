package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets{
    public List<String> subSets(String set) {
        List<String> result = new ArrayList<String>();
        if (set == null) {
            return result;
        }
        char[] arraySet = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(arraySet, sb, 0, result);
        return result;
    }

    private void helper(char[] set, StringBuilder sb, int index, List<String> result) {
        if (index == set.length) {
            result.add(sb.toString());
            return;
        }
        helper(set, sb, index + 1, result);
        helper(set, sb.append(set[index]), index + 1, result);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        AllSubsets s = new AllSubsets();
        List<String> result = s.subSets("abc");
        System.out.println(result.toString());

    }
}
