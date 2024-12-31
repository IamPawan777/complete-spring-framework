package com.bean.xml;

public class Example {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Init method...");
	}
	public void destroy() {
		System.out.println("destroy object...");
	}
}
