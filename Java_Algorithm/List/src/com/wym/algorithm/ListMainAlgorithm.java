package com.wym.algorithm;

import com.wym.algorithm.list.ListNode;
import com.wym.algorithm.reverseList.ReverseList;

public class ListMainAlgorithm {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode listNode = new ListNode();
		listNode.initList(head);
		listNode.showList(head);

		//1、移除链表元素
//		RemoveElements removeElements = new RemoveElements();
//		int val = 4;
//		ListNode node = removeElements.removeElements(head, val);
//		listNode.showList(node);

		//2、设计链表
//		DesignList designList = new DesignList();
//		designList.addAtHead(1);
//		designList.addAtTail(3);
//		designList.addAtIndex(1, 2);
//		int ret = designList.get(1);
//		System.out.println(ret);
//		designList.deleteAtIndex(1);
//		int ret2 = designList.get(1);
//		System.out.println(ret2);

		//3、翻转链表
		ReverseList reverseList = new ReverseList();
		ListNode node = reverseList.reverseList(head);
		System.out.println(node.val);
	}
}
