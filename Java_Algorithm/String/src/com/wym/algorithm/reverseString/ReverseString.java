package com.wym.algorithm.reverseString;

public class ReverseString {

	public void reverseString(char[] s) {
		int l = 0;
		int r = s.length - 1;
		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;
			l++;
			r--;
		}
	}

	public String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i += 2 * k) {
			int start = i;
			int end = Math.min(ch.length - 1, start + k - 1);
			while (start < end) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;

				start++;
				end--;
			}
		}
		return new String(ch);
	}

	public String reverseLeftWords(String s, int n) {
		int len = s.length();
		StringBuilder sb = new StringBuilder(s);
		reverseString(sb, 0, n - 1); //反转区间为前n的子串
		reverseString(sb, n, len - 1);    //反转区间为n到末尾的子串
		return sb.reverse().toString();        //反转整个字符串
	}

	public void reverseString(StringBuilder sb, int start, int end) {
		while (start < end) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			start++;
			end--;
		}
	}
}
