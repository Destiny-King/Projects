package com.wym.algorithm;

import com.wym.algorithm.reverseString.ReverseString;

public class StringMainAlgorithm {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		reverseString.reverseString(s);
		for (char c : s) {
			System.out.print(c + ",");
		}
		System.out.println();
	}
}
