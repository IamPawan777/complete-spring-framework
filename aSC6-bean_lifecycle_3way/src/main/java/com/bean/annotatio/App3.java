package com.bean.annotatio;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {	
		
		AbstractApplicationContext app = new ClassPathXmlApplicationContext("com/bean/annotatio/config.xml");
		app.registerShutdownHook();
		
		Employee a = (Employee)app.getBean("emp");
		System.out.println(a);
	}

}
