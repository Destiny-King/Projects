package com.wym.algorithm;

import com.wym.algorithm.replaceSpace.ReplaceSpace;

public class StringMainAlgorithm {
	public static void main(String[] args) {
		//1、反转字符串
//		ReverseString reverseString = new ReverseString();
//		char[] s = {'h', 'e', 'l', 'l', 'o'};
//		reverseString.reverseString(s);
//		for (char c : s) {
//			System.out.print(c + ",");
//		}
//		System.out.println();
//
//		String str = "abcdefg";
//		int k = 2;
//		String reverseStr = reverseString.reverseStr(str, k);
//		System.out.println(reverseStr);

		//2、替换空格
		ReplaceSpace replaceSpace = new ReplaceSpace();
		String s = "We are happy.";
		String str = replaceSpace.replaceSpace(s);
		System.out.println(str);
	}
}
