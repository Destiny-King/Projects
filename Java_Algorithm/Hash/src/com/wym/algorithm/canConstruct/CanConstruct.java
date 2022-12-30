package com.wym.algorithm.canConstruct;

public class CanConstruct {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] record = new int[26];
		for (char c : magazine.toCharArray()) {
			record[c - 'a'] += 1;
		}
		for (char c : ransomNote.toCharArray()) {
			record[c - 'a'] -= 1;
		}
		for (int i : record) {
			if (i < 0) {
				return false;
			}
		}
		return true;
	}
}
