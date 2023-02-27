package com.wym.algorithm;

import com.wym.algorithm.Utils.BTreeUtil;
import com.wym.algorithm.binaryTreeIteration.BinaryTreeIteration;
import com.wym.algorithm.treeNode.TreeNode;

import java.util.List;

public class BinaryTreeMainAlgorithm {

	public static void main(String[] args) {
		//1、递归遍历
//		BinaryTree binaryTree = new BinaryTree();
//		BTreeUtil bTreeUtil = new BTreeUtil();
//		int[] nums = {1, 2, 3};
//		TreeNode root = bTreeUtil.createTree(nums, 0);
//		List<Integer> preorderTraversal = binaryTree.preorderTraversal(root);
//		bTreeUtil.printTree(preorderTraversal);
//
//		List<Integer> inorderTraversal = binaryTree.inorderTraversal(root);
//		bTreeUtil.printTree(inorderTraversal);
//
//		List<Integer> postorderTraversal = binaryTree.postorderTraversal(root);
//		bTreeUtil.printTree(postorderTraversal);

		//2、迭代遍历
		BinaryTreeIteration binaryTreeIteration = new BinaryTreeIteration();
		BTreeUtil bTreeUtil = new BTreeUtil();
		int[] nums = {1, 2, 3};
		TreeNode root = bTreeUtil.createTree(nums, 0);
		List<Integer> preorderTraversal = binaryTreeIteration.preorderTraversal(root);
		bTreeUtil.printTree(preorderTraversal);

		List<Integer> inorderTraversal = binaryTreeIteration.inorderTraversal(root);
		bTreeUtil.printTree(inorderTraversal);

		List<Integer> postorderTraversal = binaryTreeIteration.postorderTraversal(root);
		bTreeUtil.printTree(postorderTraversal);
	}
}
