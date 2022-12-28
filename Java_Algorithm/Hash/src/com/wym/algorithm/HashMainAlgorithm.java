package com.wym.algorithm;

import com.wym.algorithm.fourSumCount.FourSumCount;

public class HashMainAlgorithm {

	public static void main(String[] args) {
		//1、有效的字母异位词
//		IsAnagram isAnagram = new IsAnagram();
//		String s = "anagram";
//		String t = "nagaram";
//		boolean anagram = isAnagram.isAnagram(s, t);
//		System.out.println(anagram);

		//2、两个数组的交集
//		Intersection intersection = new Intersection();
//		int[] nums1 = {4, 9, 5};
//		int[] nums2 = {9, 4, 9, 8, 4};
//		int[] res = intersection.intersection(nums1, nums2);
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);
//		}

		//3、快乐数
//		IsHappy isHappy = new IsHappy();
//		int n = 19;
//		boolean happy = isHappy.isHappy(n);
//		System.out.println(happy);

		//4、两数之和
//		TwoSum twoSum = new TwoSum();
//		int[] nums = {2, 7, 11, 15};
//		int target = 9;
//		int[] sum = twoSum.twoSum(nums, target);
//		for (int i = 0; i < sum.length; i++) {
//			System.out.println(sum[i]);
//		}

		//5、四数相加
		FourSumCount fourSumCount = new FourSumCount();
		int[] nums1 = {1, 2};
		int[] nums2 = {-2, -1};
		int[] nums3 = {-1, 2};
		int[] nums4 = {0, 2};
		int sumCount = fourSumCount.fourSumCount(nums1, nums2, nums3, nums4);
		System.out.println(sumCount);
	}
}
