package com.dsa.bst;

public class _03_IsSymmetic {

	public static void main(String[] args) {
		

	}
	
	static boolean isSymmetric(BinaryTree root) {
		
		if(root==null)
			return true;
		
		return areSymmetric(root.left, root.right);

	}
	static boolean areSymmetric(BinaryTree t1, BinaryTree t2) {
		if(t1==null || t2==null)
			return t1==t2;
		
		if(t1.val != t2.val)
			return false;
		
		
		return areSymmetric(t1.left, t2.right) && areSymmetric(t1.right, t2.left);
		
	}
}


class BinaryTree{
	int val=0;
	BinaryTree left=null;
	BinaryTree right=null;
	
	
}