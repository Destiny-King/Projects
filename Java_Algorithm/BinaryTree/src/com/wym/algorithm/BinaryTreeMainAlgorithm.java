package com.wym.algorithm;

import com.wym.algorithm.binaryTree.BinaryTree;
import com.wym.algorithm.treeNode.TreeNode;

import java.util.List;

public class BinaryTreeMainAlgorithm {

	public static void main(String[] args) {
		//1、递归遍历
		BinaryTree binaryTree = new BinaryTree();
		int[] nums = {1, 2, 3};
		TreeNode root = binaryTree.createTree(nums, 0);
		List<Integer> preorderTraversal = binaryTree.preorderTraversal(root);
		binaryTree.printTree(preorderTraversal);

		List<Integer> inorderTraversal = binaryTree.inorderTraversal(root);
		binaryTree.printTree(inorderTraversal);

		List<Integer> postorderTraversal = binaryTree.postorderTraversal(root);
		binaryTree.printTree(postorderTraversal);
	}
}
