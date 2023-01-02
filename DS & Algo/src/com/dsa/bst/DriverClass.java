package com.dsa.bst;

import java.util.Scanner;

import com.dsa.bst._01_Build_Tree_Preorder.Node;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinarySearchTree bst = new BinarySearchTree();

		while (true) {
			System.out.println("\nSelect Operation: ");
			System.out.println("1: insert");
			System.out.println("2: find");
			System.out.println("3: find smallest");
			System.out.println("4: find largest");
			System.out.println("5: delete");
			System.out.println("6: traverse");
			System.out.println("7: exit");

			System.out.println("-------------------\n");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("enter data to insert: ");
				bst.insert(sc.nextInt());
				break;
			case 2:
				System.out.print("enter element to find: ");
				TreeNode node = bst.find(sc.nextInt());
				if (node != null)
					System.err.println("element found!");
				else
					System.err.println("element not found!");
				break;
			case 3:
				System.out.println(bst.smallest());
				break;
			case 4:
				System.out.println(bst.largest());
				break;
			case 5:
				System.out.println("enter element to delete");
				bst.delete(sc.nextInt());
				break;
			case 6:
				break;
			case 7:
				System.err.println("program terminated!");
				sc.close();
				System.exit(0);
			}
		}

	}

}
