package com.bean.xml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext con = new ClassPathXmlApplicationContext("com/bean/xml/config.xml");
		con.registerShutdownHook();
		
		Example ex = (Example)con.getBean("exl");
		System.out.println(ex);
		
	}

}
