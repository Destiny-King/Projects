package com.wym.algorithm.maxSlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

class MyQueue {
	Deque<Integer> deque = new LinkedList<>();

	void poll(int val) {
		if (!deque.isEmpty() && val == deque.peek()) {
			deque.poll();
		}
	}

	void add(int val) {
		while (!deque.isEmpty() && val > deque.getLast()) {
			deque.removeLast();
		}
		deque.add(val);
	}

	int peek() {
		return deque.peek();
	}
}

public class MaxSlidingWindow {

	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 1) {
			return nums;
		}
		int len = nums.length - k + 1;
		int[] res = new int[len];
		int num = 0;
		MyQueue myQueue = new MyQueue();
		for (int i = 0; i < k; i++) {
			myQueue.add(nums[i]);
		}
		res[num++] = myQueue.peek();
		for (int i = k; i < nums.length; i++) {
			myQueue.poll(nums[i - k]);
			myQueue.add(nums[i]);
			res[num++] = myQueue.peek();
		}
		return res;
	}
}
