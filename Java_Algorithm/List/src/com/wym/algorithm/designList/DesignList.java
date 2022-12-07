package com.wym.algorithm.designList;

import com.wym.algorithm.list.ListNode;

public class DesignList {
	int size;
	ListNode head;

	public DesignList() {
		size = 0;
		head = new ListNode(0);
	}

	//获取第index个节点的数值
	public int get(int index) {
		if (index < 0 || index >= size) {
			return -1;
		}
		ListNode currentNode = head;
		for (int i = 0; i <= index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.val;
	}

	//在链表最前面插入一个节点
	public void addAtHead(int val) {
		addAtIndex(0, val);
	}

	//在链表的最后插入一个节点
	public void addAtTail(int val) {
		addAtIndex(size, val);
	}

	public void addAtIndex(int index, int val) {
		if (index > size) {
			return;
		}
		if (index < 0) {
			index = 0;
		}
		size++;
		ListNode pred = head;
		for (int i = 0; i < index; i++) {
			pred = pred.next;
		}
		ListNode toAdd = new ListNode(val);
		toAdd.next = pred.next;
		pred.next = toAdd;
	}

	//删除第index个节点
	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		size--;
		if (index == 0) {
			head = head.next;
			return;
		}
		ListNode pred = head;
		for (int i = 0; i < index; i++) {
			pred = pred.next;
		}
		pred.next = pred.next.next;
	}
}
