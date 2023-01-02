package com.dsa.algos;

import java.util.Arrays;

public class TestAlgorithms {

	public static void main(String[] args) {

//		int[] a= {4};
//		int[] a= {7, 6};
		int a[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
//		int a[]= {10, 14, 19, 27, 33, 35, 42, 44};

		System.out.println("before sorting	:" + Arrays.toString(a));
		// Optimized Bubble sort
//		a=bubbleSort(a);

		// Selection Sort
//		a = selectionSort(a);

		// Insertion Sort
//		a = InsertionSort(a);

		// Merge Sort
		a = mergeSort(a);

		System.out.println("after sorting	:" + Arrays.toString(a));
	}

// Merge sort ( nlog(n))
	static int[] mergeSort(int[] a) {
		return mergeSortImpl(a, 0, a.length - 1);
	}

	static int[] mergeSortImpl(int[] a, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;
			mergeSortImpl(a, l, mid);
			mergeSortImpl(a, mid + 1, r);
			merge(a, l, mid, r);
		}
		return a;
	}

	static int[] merge(int[] a, int l, int mid, int r) {
		int[] b = new int[a.length];
		int i = l;
		int j = mid + 1;
		int k = l;
		while (i <= mid && j <= r) {
			if (a[i] < a[j])
				b[k++] = a[i++];
			else
				b[k++] = a[j++];
		}
		if (i > mid) {
			while (j <= r)
				b[k++] = a[j++];
		} else {
			while (i <= mid)
				b[k++] = a[i++];
		}

		for (k = l; k <= r; k++)
			a[k] = b[k];

		return a;
	}

//Insertion Sort O(n^2)

	// keep left side sorted and compare those with unsorted elements
	static int[] InsertionSort(int[] a) {
		int key;
		int j;
		for (int i = 1; i < a.length; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j]; // moving larger element to smaller elements position
				j--;
			}
			a[j + 1] = key; // swapping with the moved element
		}
		return a;
	}

//Selectin Sort	O(n^2)
	static int[] selectionSort(int... a) {
		int mid = 0;

		for (int i = 0; i < a.length - 1; i++) {
			mid = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[mid])
					mid = j;
			}
			int tmp = a[mid];
			a[mid] = a[i];
			a[i] = tmp;
		}
		return a;
	}

// Optimized Bubble sort	O(n^2) || O(n)
	static int[] bubbleSort(int... a) {
		int count = 0;
		boolean swapped = false;
		for (int i = 0; i < a.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swapped = true;
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
				count++;

			}
			if (!swapped) {
				System.out.println(count);
				break;
			}
		}
		System.out.println(count);
		return a;
	}

}
