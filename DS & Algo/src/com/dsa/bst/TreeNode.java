package com.dsa.bst;

public class TreeNode {
	private Integer data;
	private TreeNode leftChild;
	private TreeNode rightChild;

	public void insert(Integer data) {
		if (data >= this.data) {
			if (this.rightChild == null)
				this.rightChild = new TreeNode(data);
			else {
				this.rightChild.insert(data);
			}
		} else {
			if (this.leftChild == null)
				this.leftChild = new TreeNode(data);
			else {
				this.leftChild.insert(data);
			}
		}

	}

	public TreeNode find(Integer data) {
		if (this.data == data) {
			return this;
		}
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		if (rightChild != null)
			return rightChild.find(data);

		return null;
	}

	public Integer smallest() {
		if (this.leftChild == null)
			return this.data;
		else
			return this.leftChild.smallest();
	}

	public Integer largest() {
		if (this.rightChild == null)
			return this.data;
		else
			return this.rightChild.largest();
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public Integer getData() {
		return data;
	}

}
