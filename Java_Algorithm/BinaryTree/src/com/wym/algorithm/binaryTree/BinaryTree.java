package com.wym.algorithm.binaryTree;

import com.wym.algorithm.treeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		preorder(root, result);
		return result;
	}

	public void preorder(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}
		result.add(root.val);
		preorder(root.left, result);
		preorder(root.right, result);
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		inorder(root, result);
		return result;
	}

	public void inorder(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}

		inorder(root.left, result);
		result.add(root.val);
		inorder(root.right, result);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		postorder(root, result);
		return result;
	}

	public void postorder(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		}

		postorder(root.left, result);
		postorder(root.right, result);
		result.add(root.val);
	}
}
