package com.dsa.algos;


import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {

	private int id;
	private String name;
	private double marks;
	private long mobile;

	static String var;

	public Student(String s) {
		var = s;
	}

	public Student(int id, String name, double marks, long mobile) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return " " + id + "\t\t" + name + "\t\t" + marks + "\t\t" + mobile;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}

		if (obj == null || !(obj instanceof Student)) {
			return false;
		}

		Student Student = (Student) obj;
		return this.id == Student.id || this.mobile == Student.mobile;
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public int compareTo(Student s) { // abstract method of comparable interface
		if (var.equalsIgnoreCase("id"))
			return ((Integer) this.id).compareTo(s.id);
		else if (var.equalsIgnoreCase("name"))
			return ((String) this.name).compareTo(s.name);
		else if (var.equalsIgnoreCase("marks"))
			return ((Double) this.marks).compareTo(s.marks);
		else
			return ((Long) this.mobile).compareTo(s.mobile);
	}

	@Override
	public int compare(Student s1, Student s2) { // abstract method of comparator interface
		if (var.equalsIgnoreCase("id"))
			return ((Integer) s2.id).compareTo(s1.id);
		else if (var.equalsIgnoreCase("name"))
			return ((String) s2.name).compareTo(s1.name);
		else if (var.equalsIgnoreCase("marks"))
			return ((Double) s2.marks).compareTo(s1.marks);
		else
			return ((Long) s2.mobile).compareTo(s1.mobile);
	}

}
