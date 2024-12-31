package com.example;

import org.springframework.beans.factory.annotation.Autowired;

//@Component(value ="p")
public class Pawan {
	
	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Pawan [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
