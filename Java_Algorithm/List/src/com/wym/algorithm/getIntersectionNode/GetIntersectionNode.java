package com.wym.algorithm.getIntersectionNode;

import com.wym.algorithm.list.ListNode;

public class GetIntersectionNode {

	public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
		ListNode cur1 = head1;
		ListNode cur2 = head2;
		int len1 = 0, len2 = 0;
		while (cur1 != null) {
			len1++;
			cur1 = cur1.next;
		}
		while (cur2 != null) {
			len2++;
			cur2 = cur2.next;
		}
		cur1 = head1;
		cur2 = head2;
		if (len2 > len1) {
			int tmpLen = len1;
			len1 = len2;
			len2 = tmpLen;
			ListNode tmpNode = cur1;
			cur1 = cur2;
			cur2 = tmpNode;
		}
		int gap = len1 - len2;
		while (gap-- > 0) {
			cur1 = cur1.next;
		}
		while (cur1 != null) {
			if (cur1.val == cur2.val) {
				return cur1;
			}
			cur1 = cur1.next;
			cur2 = cur2.next;
		}
		return null;
	}
}
