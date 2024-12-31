package com.bean.interfac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("com/bean/interfac/config.xml");
		app.registerShutdownHook();
		
		Student a = (Student)app.getBean("std");
		System.out.println(a);
	}

}
