package com.dsa.queues;

import java.util.Scanner;

public class CircularQueueImpl {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue();
		
		cq.dequeue();
		cq.enqueue(10);
		cq.peek();
		System.out.println();
		
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		cq.enqueue(60);
		cq.peek();
		System.out.println();
		
		cq.dequeue();
		cq.peek();
		System.out.println();
		
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		
		

	}

}

class CircularQueue {
	int head = -1;
	int tail = -1;
	int arr[] = new int[5];

	public void enqueue(int element) {
		if (head == -1 && tail == -1) {
			head=0;
			tail=0;
			arr[tail]=element;
			System.out.println(element + " added at " + tail + " index");
		}
		else if(head!=-1 && tail<arr.length-1 && head < tail) {
			arr[++tail]=element;
			System.out.println(element + " added at " + tail + " index");
		}
		else if(tail==arr.length-1 && (Math.abs(tail-head)<arr.length)) {
			tail=0;
			System.out.println("Head: "+head+"Tail: "+tail);
//			if(tail<head) {
				System.out.println(element + " added at " + tail + " index");
				arr[tail++]=element;
//			}
//			else {
//				System.out.println("queue is overflow");
//			}

		}
		else {
			System.out.println("queue is overflow");
		}
		
		
	}

	public void dequeue() {
		if (tail != -1) {
			System.out.println(arr[head++] + " dequeued");
		} else {
			System.out.println("queue is empty");
		}
	}

	public void peek() {
//		System.out.println("head" + head);
		if (head != -1)
			System.out.println(arr[head]);
		else
			System.out.println("queue is empty");
	}

}
