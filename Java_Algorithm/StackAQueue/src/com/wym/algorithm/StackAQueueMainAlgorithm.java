package com.wym.algorithm;

import com.wym.algorithm.topKFrequent.TopKFrequent;

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
//		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
//		String s = "abbaca";
//		String str = removeDuplicates.removeDuplicates(s);
//		System.out.println(str);

		//5、逆波兰表达式求值
//		EvalRPN evalRPN = new EvalRPN();
//		String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
//		int rpn = evalRPN.evalRPN(tokens);
//		System.out.println(rpn);

		//6、滑动窗口最大值
//		MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();
//		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
//		int k = 3;
//		int[] slidingWindow = maxSlidingWindow.maxSlidingWindow(nums, k);
//		for (int i = 0; i < slidingWindow.length; i++) {
//			System.out.print(slidingWindow[i] + " ");
//		}

		//7、前k个高频元素
		TopKFrequent topKFrequent = new TopKFrequent();
		int[] nums = {1, 1, 1, 2, 2, 3};
		int k = 2;
		int[] frequent = topKFrequent.topKFrequent(nums, k);
		for (int i = 0; i < frequent.length; i++) {
			System.out.print(frequent[i] + " ");
		}
	}
}
