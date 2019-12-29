package com.leetcode;

public class MaximumSubarray {
        public int maxSubArray(int[] nums) {
            int[] memo = new int[nums.length + 1];
            memo[0] = nums[0];
            int globalMax = memo[0];
            for (int i = 1; i < nums.length; i++) {
                if (memo[i - 1] < 0) {
                    memo[i] = nums[i];
                } else {
                    memo[i] = memo[i - 1] + nums[i];
                }
                globalMax = Math.max(memo[i], globalMax);
            }
            return globalMax;
        }
}
