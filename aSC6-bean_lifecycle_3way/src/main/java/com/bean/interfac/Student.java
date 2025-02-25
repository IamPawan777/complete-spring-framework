package com.bean.interfac;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	private int number;

	public Student(int number) {
		super();
		this.number = number;
	}
	

	public Student() {
		super();
	}


	@Override
	public String toString() {
		return "Student [number=" + number + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization......");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method....");
		
	}
	
}
