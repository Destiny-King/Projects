package com.wym.algorithm;

import com.wym.algorithm.binarysearch.BinarySearch;

public class MainAlgorithm {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] nums = {-1, 0, 3, 5, 9, 12, 14};
		int target = 9;
		int ret = binarySearch.search(nums, target);
		System.out.println(ret);
	}
}
