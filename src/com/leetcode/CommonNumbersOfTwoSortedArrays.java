package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonNumbersOfTwoSortedArrays {
    public List<Integer> common(int[] A, int[] B) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i]) && map.get(B[i]) > 0) {
                result.add(B[i]);
                map.put(B[i], map.get(B[i]) - 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        CommonNumbersOfTwoSortedArrays s = new CommonNumbersOfTwoSortedArrays();
        List<Integer> res = new ArrayList<>();
        res = s.common(new int[]{1,2,3,4,5,6}, new int[]{1,3,3,3});
        System.out.println(res.toString());

    }
}
