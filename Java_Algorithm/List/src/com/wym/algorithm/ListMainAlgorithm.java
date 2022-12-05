package com.wym.algorithm;

import com.wym.algorithm.list.ListNode;
import com.wym.algorithm.removeElements.RemoveElements;

public class ListMainAlgorithm {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode listNode = new ListNode();
		listNode.initList(head);
		listNode.showList(head);

		//1、移除链表元素
		RemoveElements removeElements = new RemoveElements();
		int val = 4;
		ListNode node = removeElements.removeElements(head, val);
		listNode.showList(node);
	}
}
