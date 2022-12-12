package com.wym.algorithm.reverseList;

import com.wym.algorithm.list.ListNode;

public class ReverseList {

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode cur = head;
		ListNode tmp = null;
		while (cur != null) {
			tmp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = tmp;
		}
		return prev;
	}
}
