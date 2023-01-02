package com.dsa.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.dsa.bst._01_Build_Tree_Preorder.Node;

public class _02_Tree_Traversals {
	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static void postorder(Node root) {
		if(root ==null)	
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	 
	public static void levelorder(Node root) {
		if(root == null)
			return;
//		List<List> list=new ArrayList<>();
//		List<Integer> subList=new ArrayList<Integer>();
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty()) {
			Node currNode=q.remove();
			if(currNode == null) {
				System.out.println();
//				list.add(subList);
//				subList=new ArrayList<>();
				
				if(q.isEmpty()) {
					break;
				}else {
					
					q.add(null);
					
				}
			}else {
				System.out.print(currNode.data+" ");
				
//				subList.add(currNode.data);
				System.out.println(currNode.data);
				if(currNode.left!=null)
					q.add(currNode.left);
				if(currNode.right!=null)
					q.add(currNode.right);
			}
			

		}

//		System.out.print("result: "+list.toString());
	}
}
