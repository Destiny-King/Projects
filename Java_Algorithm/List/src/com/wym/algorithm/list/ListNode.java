package com.wym.algorithm.list;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	//创建链表
	public void initList(ListNode head, int[] nums) {
		ListNode cur = head;
		for (int i = 1; i < nums.length; i++) {
			ListNode node = new ListNode(nums[i]);
			cur.next = node;
			cur = node;
		}
	}

	//显示链表
	public void showList(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	//创建环形链表
	public ListNode createCycle(int n) {
		//创建具有n个节点的循环链表,第i个节点对应的val=i
		ListNode head = new ListNode(n);
		//头插法，每次在链表头部插入节点
		head.next = head;
		for (int i = n - 1; i >= 1; i--) {
			ListNode node = new ListNode(i);
			node.next = head.next;
			head.next = node;
		}
		return head.next; //根据节点意义，确定谁才是最终的头结点
	}

	//显示环形链表
	public void showCycle(ListNode head) {
		ListNode cur = head;
		while (cur.next != head) {
			System.out.print(cur.val + " ");
			cur = cur.next;
		}
		System.out.println(cur.val);
	}
}
