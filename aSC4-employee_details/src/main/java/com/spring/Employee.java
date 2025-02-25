package com.spring;

public class Employee {
	private int emp_id;
	private String emp_name;
	private Address address;
	
	public Employee() {
		super();
	}
	public Employee(int emp_id, String emp_name, Address address) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", address:  " + address + "]";
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
