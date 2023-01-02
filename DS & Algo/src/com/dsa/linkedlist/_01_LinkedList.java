package com.dsa.linkedlist;

public class _01_LinkedList {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		list.insertAtHead(20);
		list.insertAtHead(12);
		list.insertAtHead(50);
		list.insertAtHead(30);

		System.out.println(list);
		System.out.println("lenght of ll is: " + list.length());
		
		list.deleteFromHead();
		System.out.println(list);
		System.out.println(list.length());
		
		System.out.println("Found: "+list.searchData(11));
	
	}
}

class MyLinkedList {
	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	public void deleteFromHead() {
		this.head=this.head.getNextNode();
	}
	
	public Node searchData(int data) {
		Node current=this.head;
		
		while(current!=null) {
			if(current.getData()==data) {
				return current;
			}
			current=current.getNextNode();
		}
		return null;
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;

		while (current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
		}
		result += "}";
		return result;
	}
}

class Node {
	private int data;
	private Node nextNode;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public Node getNextNode() {
		return this.nextNode;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Data: " + this.data;
	}
}
