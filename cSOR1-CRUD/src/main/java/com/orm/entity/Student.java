package com.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="Student_details")
public class Student {
	@Id
	private int s_id;
	private String s_name;
	private String s_city;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int s_id, String s_name, String s_city) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_city = s_city;
	}
	
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
	public String getS_city() {
		return s_city;
	}
	public void setS_city(String s_city) {
		this.s_city = s_city;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", s_city=" + s_city + "]";
	}
	
	
}

