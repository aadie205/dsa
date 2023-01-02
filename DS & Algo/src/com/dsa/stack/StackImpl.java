package com.dsa.stack;

public class StackImpl {
	public static void main(String[] args) {
		CustomStack cs = new CustomStack();

//		cs.push(10);
//		System.out.println(cs.peek());
//		cs.push(5);
//		cs.push(4);
		cs.push(8);
		cs.peek();
		cs.pop();
		cs.peek();
	}
}

class CustomStack {

	int top = -1;
	int arr[] = new int[5];

	public void push(int element) {
		if (top < arr.length - 1) {
			arr[++top] = element;
		} else {
			System.out.println("stack is full!");
		}
	}

	public void pop() {
		if (top == -1)
			System.out.println("stack is empty!");
		else {
			System.out.println(arr[top--]+" popped!");
		}

	}

	public void peek() {
		if (top == -1) {
			System.out.println("stack is empty!");
			return;
		} else {
			System.out.println(arr[top]);
		}

	}

}