package com.leetcode;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();
        Deque<int[]> stack = new LinkedList<>();
        stack.offerFirst(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] top = stack.peekFirst();
            if(top[1] < intervals[i][0]) {
                stack.offerFirst(intervals[i]);
            } else if (top[1] < intervals[i][1]) {
                top[1] = intervals[i][1];
                stack.pollFirst();
                stack.offerFirst(top);
            }
        }
        if (!stack.isEmpty()) {
            result.add(stack.pollLast());
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals s = new MergeIntervals();
        int[][] res = s.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        System.out.println(res.toString());
    }
}


