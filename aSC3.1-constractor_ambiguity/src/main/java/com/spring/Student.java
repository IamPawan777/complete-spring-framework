package com.spring;

public class Student {
	private int id;
	private int roll;
	private String name;
	
	public Student( double id, double roll, String name) {
		this.roll = (int)roll;
		this.id = (int)id;
		this.name = name;
		System.out.println("double | double");
	}
	
	public Student(int id, int roll, String name) {
		this.id = id;
		this.roll = roll;
		this.name = name;
		System.out.println("int | int");
	}
	public Student(int id, double roll, String name) {
		this.id = id;
		this.roll = (int)roll;
		this.name = name;
		System.out.println("int | double");
	}
	
	public Student(String roll, String id, String name) {
		this.roll = Integer.parseInt(roll);
		this.id = Integer.parseInt(id);
		this.name = name;
		System.out.println("String | string");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + "]";
	}

	
	
}
