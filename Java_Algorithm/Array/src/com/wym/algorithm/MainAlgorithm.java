package com.wym.algorithm;

import com.wym.algorithm.removeelement.RemoveElement;

public class MainAlgorithm {

	public static void main(String[] args) {
		//1、二分查找
//		BinarySearch binarySearch = new BinarySearch();
//		int[] nums = {-1, 0, 3, 5, 9, 12, 14};
//		int target = 9;
//		int ret = binarySearch.search(nums, target);
//		System.out.println(ret);

		//2、移除元素
		RemoveElement removeElement = new RemoveElement();
		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		int val = 2;
		int ret = removeElement.removeElement(nums, val);
		System.out.println(ret);
	}
}
