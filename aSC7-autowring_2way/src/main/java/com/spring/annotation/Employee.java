package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String emp_name;
	
	@Autowired
	
	//@Qualifier(value = "address2")
	private Address address;
	
	public Employee(Address address) {
		super();		
		this.address = address;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", address=" + address + "]";
	}
	
}
