package com.wym.algorithm;

import com.wym.algorithm.strStr.StrStr;

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
//		ReplaceSpace replaceSpace = new ReplaceSpace();
//		String s = "We are happy.";
//		String str = replaceSpace.replaceSpace(s);
//		System.out.println(str);

		//3、翻转字符串里的单词
//		ReverseWords reverseWords = new ReverseWords();
//		String s = "the sky is blue";
//		String words = reverseWords.reverseWords(s);
//		System.out.println(words);

		//4、左旋转字符串
//		ReverseString reverseString = new ReverseString();
//		String s = "abcdefg";
//		int n = 2;
//		String words = reverseString.reverseLeftWords(s, n);
//		System.out.println(words);

		//5、实现strStr
		StrStr strStr = new StrStr();
		String haystack = "hello";
		String needle = "ll";
		int str = strStr.strStr(haystack, needle);
		System.out.println(str);
	}
}
