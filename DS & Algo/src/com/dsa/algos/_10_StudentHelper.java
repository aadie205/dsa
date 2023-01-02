package com.dsa.algos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class _10_StudentHelper {

	static Scanner scanner = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();
	static Set<Student> set = new HashSet<Student>();
	static Iterator<Student> iterator = null;
	static Student student = null;

	public void addStudent() {
		System.out.print(" Enter the student id : ");
		int id = scanner.nextInt();
		System.out.print(" Enter the student name : ");
		String name = scanner.next();
		System.out.print(" Enter the student marks : ");
		double marks = scanner.nextDouble();
		System.out.print(" Enter the student mobile number : ");
		long mobile = scanner.nextLong();

		if (set.add(new Student(id, name, marks, mobile))) { // to check duplicate id or mobile number
			if (list.add(new Student(id, name, marks, mobile))) { // to check whether details added
				System.out.println(" Student details added successfully !!!");
			} else {
				System.out.println(" Student details has not been added !!!");
			}
		} else {
			System.out.println(" Duplicate Id or Mobile Number not allowed !!");
		}
	}

	public void displayAllStudents() {
		if (list.isEmpty()) {
			System.out.println(" List is empty, cannot display !!!");
		} else {
			System.out.println();
			System.out.println(" id\t\tname\t\tmarks\t\tmobile");
			System.out.println("-----------------------------------------------------------");

			iterator = list.iterator();
			while (iterator.hasNext()) {
				student = iterator.next();
				System.out.println(student);
			}
			System.out.println();
		}
	}

	public void searchStudent() {
		if (list.isEmpty()) {
			System.out.println(" List is empty, cannot search !!!");
		} else {
			System.out.println(" Enter the id to be searched : ");
			int id = scanner.nextInt();
			boolean flag = false;

			iterator = list.iterator();
			while (iterator.hasNext()) {
				student = iterator.next();
				if (student.getId() == id) {
					flag = true;
					break;
				}
			}

			if (flag)
				System.out.println(" Student with id = " + id + " found successfully !!");
			else
				System.out.println(" Student with id = " + id + " does not exist !!");
		}
	}

	public void deleteStudent() {
		if (list.isEmpty()) {
			System.out.println(" List is empty, cannot remove !!");
		} else {
			System.out.print(" Enter the student id to delete the student : ");
			int id = scanner.nextInt();
			boolean flag = false;

			iterator = list.iterator();
			while (iterator.hasNext()) {
				student = iterator.next();
				if (student.getId() == id) {
					iterator.remove();
					flag = true;
					break;
				}
			}

			if (flag)
				System.out.println(" Student with id = " + id + " has been deleted Successfully !!");
			else
				System.out.println(" Student with id = " + id + " does not exist !!");
		}
	}

	public void updateStudentDetails() {
		if (list.isEmpty()) {
			System.out.println(" List is empty, cannot update !!");
		} else {
			System.out.print(" Enter the student id to update the student details : ");
			int id = scanner.nextInt();
			boolean flag = false;

			iterator = list.iterator();
			while (iterator.hasNext()) {
				student = iterator.next();
				if (student.getId() == id) {
					flag = true;
					break;
				}
			}

			if (flag) {
				System.out.println("(1) Name\n(2) Marks\n(3) Mobile");
				System.out.println(" Enter which Student detail you want to update : ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					updateStudentName(id);
					break;

				case 2:
					updateStudentMarks(id);
					break;

				case 3:
					updateStudentMobile(id);
					break;

				default:
					System.out.println(" Invalid option !!!");
				}
			} else {
				System.out.println(" Student with id = " + id + " does not exist !!");
			}
		}
	}

	public void updateStudentName(int id) {
		System.out.println(" Enter the name you want to update : ");
		String name = scanner.next();

		iterator = list.iterator();
		while (iterator.hasNext()) {
			student = iterator.next();
			if (student.getId() == id) {
				student.setName(name);
				System.out.println(" Name has been Updated successfully !!!");
				break;
			}
		}
	}

	public void updateStudentMarks(int id) {
		System.out.println(" Enter the marks you want to update : ");
		double marks = scanner.nextDouble();

		iterator = list.iterator();
		while (iterator.hasNext()) {
			student = iterator.next();
			if (student.getId() == id) {
				student.setMarks(marks);
				System.out.println(" Marks has been Updated successfully !!!");
				break;
			}
		}
	}

	public void updateStudentMobile(int id) {
		System.out.println(" Enter the mobile number you want to update : ");
		long mobile = scanner.nextLong();

		iterator = list.iterator();
		while (iterator.hasNext()) {
			student = iterator.next();
			if (student.getId() == id) {
				student.setMobile(mobile);
				System.out.println(" Mobile has been Updated successfully !!!");
				break;
			}
		}
	}

	public void sortStudents() {
		if (list.isEmpty()) {
			System.out.println(" List is empty, cannot sort !!");
		} else {
			System.out.println(" Enter your choice how you want to sort : ");
			System.out.println("(1) Ascending Order\n(2) Descending Order");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				sortAscendingOrder();
				break;

			case 2:
				sortDescendingOrder();
				break;

			default:
				System.out.println(" Invalid option !!!");
			}
			displayAllStudents();
		}
	}

	public void sortAscendingOrder() {
		System.out.println("(1) Sort by id\n(2) Sort by name\n(3) Sort by marks\n(4) Sort by mobile");
		System.out.print(" Enter what you want to sort : ");
		int sortAsc = scanner.nextInt();

		switch (sortAsc) {
		case 1:
			Student.var = "id";
			Collections.sort(list);
			System.out.println(" List Sorted by Id in Ascending Order Successfully !!");
			break;

		case 2:
			Student.var = "name";
			Collections.sort(list);
			System.out.println(" List Sorted by Name in Ascending Order Successfully !!");
			break;

		case 3:
			Student.var = "marks";
			Collections.sort(list);
			System.out.println(" List Sorted by Marks in Ascending Order Successfully !!");
			break;

		case 4:
			Student.var = "mobile";
			Collections.sort(list);
			System.out.println(" List Sorted by Mobile in Ascending Order Successfully !!");
			break;

		default:
			System.out.println(" Invalid Option !!!");
		}
	}

	public void sortDescendingOrder() {
		System.out.println("(1) Sort by id\n(2) Sort by name\n(3) Sort by marks\n(4) Sort by mobile");
		System.out.print(" Enter what you want to sort : ");
		int sortDesc = scanner.nextInt();

		switch (sortDesc) {
		case 1:
			Collections.sort(list, new Student("id"));
			System.out.println(" List Sorted by Id in Descending Order Successfully !!");
			break;

		case 2:
			Collections.sort(list, new Student("name"));
			System.out.println(" List Sorted by Name in Descending Order Successfully !!");
			break;

		case 3:
			Collections.sort(list, new Student("marks"));
			System.out.println(" List Sorted by Marks in Descending Order Successfully !!");
			break;

		case 4:
			Collections.sort(list, new Student("mobile"));
			System.out.println(" List Sorted by Mobile in Descending Order Successfully !!");
			break;

		default:
			System.out.println(" Invalid Option !!!");
		}
	}

}
