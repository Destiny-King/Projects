package com.wym.algorithm;

import com.wym.algorithm.myQueue.MyQueue;

public class StackAQueueMainAlgorithm {

	public static void main(String[] args) {
		//1、用栈实现队列
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		int peek = queue.peek();
		System.out.println(peek);
		int pop = queue.pop();
		System.out.println(pop);
		boolean empty = queue.empty();
		System.out.println(empty);
	}
}
