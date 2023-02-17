package com.wym.algorithm;

import com.wym.algorithm.removeDuplicates.RemoveDuplicates;

public class StackAQueueMainAlgorithm {

	public static void main(String[] args) {
		//1、用栈实现队列
//		MyQueue queue = new MyQueue();
//		queue.push(1);
//		queue.push(2);
//		int peek = queue.peek();
//		System.out.println(peek);
//		int pop = queue.pop();
//		System.out.println(pop);
//		boolean empty = queue.empty();
//		System.out.println(empty);

		//2、用队列实现栈
//		MyStack stack = new MyStack();
//		stack.push(1);
//		stack.push(2);
//		int top = stack.top();
//		System.out.println(top);
//		int pop = stack.pop();
//		System.out.println(pop);
//		stack.push(3);
//		stack.push(4);
//		int pop1 = stack.pop();
//		System.out.println(pop1);
//		int pop2 = stack.pop();
//		System.out.println(pop2);
//		int pop3 = stack.pop();
//		System.out.println(pop3);
//		boolean empty = stack.empty();
//		System.out.println(empty);

		//3、有效的括号
//		ValidParenthesis validParenthesis = new ValidParenthesis();
//		String s = "()[]{}";
//		boolean valid = validParenthesis.isValid(s);
//		System.out.println(valid);

		//4、删除字符串中的所有相邻重复项
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		String s = "abbaca";
		String str = removeDuplicates.removeDuplicates(s);
		System.out.println(str);
	}
}
