package com.wym.algorithm.removeElements;

import com.wym.algorithm.list.ListNode;

public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return head;
		}

		ListNode dummy = new ListNode(-1, head);
		ListNode pre = dummy;
		ListNode cur = head;

		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;
			} else {
				pre = cur;
			}
			cur = cur.next;
		}
		return dummy.next;
	}
}
