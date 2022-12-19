package com.wym.algorithm;

import com.wym.algorithm.isAnagram.IsAnagram;

public class HashMainAlgorithm {

	public static void main(String[] args) {
		IsAnagram isAnagram = new IsAnagram();
		String s = "anagram";
		String t = "nagaram";
		boolean anagram = isAnagram.isAnagram(s, t);
		System.out.println(anagram);
	}
}
