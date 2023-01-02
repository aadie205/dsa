package com.dsa.bst;

public class _01_Build_Tree_Preorder {

	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
//		System.out.println(root.data);
//		System.out.println(root.left.data);
//		System.out.println(root.right.data);
		
		_02_Tree_Traversals.preorder(root);
		System.out.println("\n********\n");
		_02_Tree_Traversals.inorder(root);
		System.out.println("\n********\n");
		_02_Tree_Traversals.postorder(root);
		System.out.println("\n********\n");
		_02_Tree_Traversals.levelorder(root);
	}
	
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]){
			idx++;
			if(nodes[idx]== -1)
				return null;
			
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			
			return newNode;
		}
	}
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
}
