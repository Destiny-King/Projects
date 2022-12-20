package com.wym.algorithm;

import com.wym.algorithm.intersection.Intersection;

public class HashMainAlgorithm {

	public static void main(String[] args) {
		//1、有效的字母异位词
//		IsAnagram isAnagram = new IsAnagram();
//		String s = "anagram";
//		String t = "nagaram";
//		boolean anagram = isAnagram.isAnagram(s, t);
//		System.out.println(anagram);

		//2、两个数组的交集
		Intersection intersection = new Intersection();
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {9, 4, 9, 8, 4};
		int[] res = intersection.intersection(nums1, nums2);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
