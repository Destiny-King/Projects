package com.wym.algorithm.binarysearch;

public class BinarySearch {
	public int search(int[] nums, int target) {
		int left = 0, right = nums.length;
		while (left < right) {
			//右移运算符>>,运算结果正好能对应一个整数的二分之一值，但是比除2运算要快。
			int mid = left + ((right - left) >> 1);
			//int mid = (left + right) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				left = mid + 1;
			else if (nums[mid] > target)
				right = mid;
		}
		return -1;
	}
}
