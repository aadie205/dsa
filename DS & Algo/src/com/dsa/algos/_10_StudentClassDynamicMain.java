package com.dsa.algos;




import java.util.Scanner;

public class _10_StudentClassDynamicMain {


	static Scanner scanner = new Scanner(System.in);
	static _10_StudentHelper operations = new _10_StudentHelper();

	public static void main(String[] args) {

		while (true) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("                         Main Menu                         ");
			System.out.println("-----------------------------------------------------------");
			System.out.println("(1) Add\n(2) Display\n(3) Search\n(4) Delete\n(5) Update\n(6) Sort");
			System.out.print(" Enter your choice : ");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				operations.addStudent();
				break;

			case 2:
				operations.displayAllStudents();
				break;

			case 3:
				operations.searchStudent();
				break;

			case 4:
				operations.deleteStudent();
				break;

			case 5:
				operations.updateStudentDetails();
				break;

			case 6:
				operations.sortStudents();
				break;

			default:
				System.out.println(" Invalid Choice !!");
			}
		}

	}

}
