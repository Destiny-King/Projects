package com.wym.algorithm.minsubarrayLen;

public class MinSubArrayLen {
	public int minSubArrayLen(int[] nums, int s) {
		int left = 0;
		int sum = 0;
		int result = Integer.MAX_VALUE;//int数据类型的最大取值数
		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];
			while (sum >= s) {
				result = Math.min(result, right - left + 1);
				sum -= nums[left++];
			}
		}
		return result == Integer.MAX_VALUE ? 0 : result;
	}
}
