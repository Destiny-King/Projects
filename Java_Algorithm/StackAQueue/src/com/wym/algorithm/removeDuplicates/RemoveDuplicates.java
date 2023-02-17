package com.wym.algorithm.removeDuplicates;

public class RemoveDuplicates {

	public String removeDuplicates(String s) {
		StringBuilder res = new StringBuilder();
		int top = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (top >= 0 && res.charAt(top) == c) {
				res.deleteCharAt(top);
				top--;
			} else {
				res.append(c);
				top++;
			}
		}
		return res.toString();
	}
}
