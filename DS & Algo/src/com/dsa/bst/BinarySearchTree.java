package com.dsa.bst;



public class BinarySearchTree {

	private TreeNode root;

	public void insert(Integer data) {
		if (root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
		System.err.println(data+" inserted");
	}
	
	public Integer smallest() {
		if ( this.root !=null)
			return root.smallest();
		return null;
	}
	public Integer largest() {
		if(this.root!=null)
			return root.largest();
		return null;
	}

	public TreeNode find(Integer data) {
		if (root != null)
			return root.find(data);
		return null;
	}

	public void delete(Integer data) {
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		//1st-case: if the node has no child
		if (current == null) {
			System.err.println("BST is empty");
			return;
		}
			
		else if (current != null && current.getData() != data) {
			parent = current;

			if (data < current.getData()) {
				current = current.getLeftChild();
				isLeftChild = true;
			} else {
				current = current.getRightChild();
				isLeftChild = false;
			}
		}
		if (current == null)
			return;
		//2nd-case: If the node has only one child node
		if (current.getLeftChild() == null && current.getRightChild() == null) {
			if (current == root) {
				root = null;
			} else {
				if (isLeftChild)
					parent.setLeftChild(null);
				else
					parent.setRightChild(null);
			}
		} else if (current.getRightChild() == null) {
			if (current == root)
				root = current.getLeftChild();
			else if (isLeftChild)
				parent.setLeftChild(current.getLeftChild());
			else
				parent.setRightChild(current.getLeftChild());
		} else if (current.getLeftChild() == null) {
			if (current == root)
				root = current.getRightChild();
			else if (isLeftChild)
				parent.setLeftChild(current.getRightChild());
			else
				parent.setRightChild(current.getRightChild());
		}
		//3rd-case: If the node has two child nodes
		else {
			
		}
		
	}// delete

}// class
