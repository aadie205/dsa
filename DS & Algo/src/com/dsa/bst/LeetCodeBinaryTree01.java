package com.dsa.bst;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeBinaryTree01 {

	public static void main(String[] args) {
//		Node2 root=new Node2(1,null, 2, 3);
	}

	public List<Integer> preorderTraversal(Node2 root) {
		// Input: root = [1,null,2,3]
		// Output: [1,2,3]

		List<Integer> list = new ArrayList<>();

		preOrder(root, list);
		return list;

	}

	public static void preOrder(Node2 root, List<Integer> list) {
		if (root == null)
			return;

		list.add(root.val);
		preOrder(root.left, list);
		preOrder(root.right, list);
	}

}// class
//Definition for a binary tree node.

class Node2 {
	int val;
	Node2 left;
	Node2 right;

	Node2() {
	}

	Node2(int val) {
		this.val = val;
	}

	Node2(int val, Node2 left, Node2 right) {
		this.val = val;
		this.left = left;
		this.right = right;

	}
}