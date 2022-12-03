package com.wym.algorithm;

import com.wym.algorithm.spiralmatrix.SpiralMatrix;

public class MainAlgorithm {

	public static void main(String[] args) {
		//1、二分查找
//		BinarySearch binarySearch = new BinarySearch();
//		int[] nums = {-1, 0, 3, 5, 9, 12, 14};
//		int target = 9;
//		int ret = binarySearch.search(nums, target);
//		System.out.println(ret);

		//2、移除元素
//		RemoveElement removeElement = new RemoveElement();
//		int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//		int val = 2;
//		int ret = removeElement.removeElement(nums, val);
//		System.out.println(ret);

		//3、有序数组的平方
//		ArraySquare arraySquare = new ArraySquare();
//		int[] nums = {-4, -1, 0, 3, 10};
//		int[] ret = arraySquare.sortedSquares(nums);
//		for (int i : ret) {
//			System.out.print(i + " ");
//		}

		//4、长度最小的子数组
//		MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
//		int[] nums = {2, 3, 1, 2, 4, 3};
//		int s = 7;
//		int ret = minSubArrayLen.minSubArrayLen(nums, s);
//		System.out.println(ret);

		//5、螺旋矩阵II
		SpiralMatrix spiralMatrix = new SpiralMatrix();
		int n = 4;
		int[][] res = spiralMatrix.generateMatrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
