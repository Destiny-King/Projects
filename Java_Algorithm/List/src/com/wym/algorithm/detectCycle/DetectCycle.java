package com.wym.algorithm.detectCycle;

import com.wym.algorithm.list.ListNode;

public class DetectCycle {

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				ListNode index1 = fast;
				ListNode index2 = slow;
				while (index1 != index2) {
					index1 = index1.next;
					index2 = index2.next;
				}
				return index1;
			}
		}
		return null;
	}
}
