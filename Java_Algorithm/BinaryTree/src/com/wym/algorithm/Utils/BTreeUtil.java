package com.wym.algorithm.Utils;

import com.wym.algorithm.treeNode.TreeNode;

import java.util.List;

public class BTreeUtil {

	public TreeNode createTree(int[] nums, int index) {
		if (index > nums.length - 1 || nums[index] == 0)
			return null;
		TreeNode node = new TreeNode(nums[index]);
		node.left = createTree(nums, 2 * index + 1);
		node.right = createTree(nums, 2 * index + 2);
		return node;
	}

	public void printTree(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}
}
