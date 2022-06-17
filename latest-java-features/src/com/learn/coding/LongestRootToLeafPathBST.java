package com.learn.coding;

import java.util.Scanner;

class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

public class LongestRootToLeafPathBST {

	public static int getHeight(TreeNode root) {
		if (root == null)
			return -1;
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if (leftHeight > rightHeight)
			return leftHeight + 1;
		return rightHeight + 1;
	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		} else {
			TreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		sc.close();
		int height = getHeight(root);
		System.out.println(height);
	}
}