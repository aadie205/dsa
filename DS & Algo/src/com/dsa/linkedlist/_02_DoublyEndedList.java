package com.dsa.linkedlist;

public class _02_DoublyEndedList {

	public static void main(String[] args) {
		DoublyEndedList dList=new DoublyEndedList();
		dList.insertAtTail(15);
		dList.insertAtTail(12);
		dList.insertAtTail(10);
		
		System.out.println(dList);

	}

}

class DoublyEndedList {
	private Node head;
	private Node tail;
	
	public void insertAtTail(int data) {
		Node newNode = new Node(data);
		if(this.head==null) {
			this.head=newNode;
		}
		if(this.tail!=null)
			this.tail.setNextNode(newNode);
		this.tail=newNode;
	}
	@Override
	public String toString() {
		String result="{";
		Node current=this.head;
		
		while(current!=null) {
			result+=current.toString()+", ";
			current=current.getNextNode();
		}
		result+="}";
		return result;
	}
}
