package com.spring;

public class Employee {
	private String emp_name;
	private Address address;
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
	// contructor use for autowring
	public Employee(Address address) {
		super();
		
		this.address = address;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", address=" + address + "]";
	}
	
}
