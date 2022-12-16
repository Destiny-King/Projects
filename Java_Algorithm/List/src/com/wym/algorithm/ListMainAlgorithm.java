package com.wym.algorithm;

import com.wym.algorithm.getIntersectionNode.GetIntersectionNode;
import com.wym.algorithm.list.ListNode;

public class ListMainAlgorithm {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		ListNode head = new ListNode(1);
		ListNode listNode = new ListNode();
		listNode.initList(head, nums);
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
//		ReverseList reverseList = new ReverseList();
//		ListNode node = reverseList.reverseList(head);
//		System.out.println(node.val);

		//4、两两交换链表中的节点
//		SwapPairs swapPairs = new SwapPairs();
//		ListNode node = swapPairs.swapPaird(head);
//		System.out.println(node.val);

		//5、删除链表的倒数第N个节点
//		RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
//		int n = 2;
//		ListNode node = removeNthFromEnd.removeNthFromEnd(head, n);
//		System.out.println(node.val);
//		listNode.showList(head);

		//6、链表相交
		GetIntersectionNode getIntersectionNode = new GetIntersectionNode();
		int[] nums2 = {3, 4, 5};
		ListNode head2 = new ListNode(3);
		ListNode listNode2 = new ListNode();
		listNode2.initList(head2, nums2);
		listNode2.showList(head2);
		ListNode node = getIntersectionNode.getIntersectionNode(head, head2);
		System.out.println(node.val);
	}
}
