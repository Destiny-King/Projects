package com.wym.algorithm.swapPairs;

import com.wym.algorithm.list.ListNode;

public class SwapPairs {

	public ListNode swapPaird(ListNode head) {
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
		ListNode cur = dummyNode;
		while (cur.next != null && cur.next.next != null) {
			ListNode tmp = head.next.next;
			cur.next = head.next;
			head.next.next = head;
			head.next = tmp;
			cur = head;
			head = head.next;
		}
		return dummyNode.next;
	}
}
