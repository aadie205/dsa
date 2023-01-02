package com.dsa.maps;

//public class Student implements Comparable<Student>{
public class Student {
	int marks;
	String name;
	
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [makrs= "+marks+", name= "+name +"	]";
	}
	
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	@Override
//	public int compareTo(Student obj) {
//		return this.marks-obj.marks;
//	}
//	
	

}
