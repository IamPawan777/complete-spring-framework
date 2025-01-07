package com.spring.Entities;

public class Student {
	private int s_id;
	private String s_name;
	private String s_course;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String gets_course() {
		return s_course;
	}
	public void sets_course(String s_course) {
		this.s_course = s_course;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_course=" + s_course + "]";
	}
	
}
