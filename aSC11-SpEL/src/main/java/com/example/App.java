package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("applicationConfig.xml");
    	
    	Pawan bean = app.getBean("pawan", Pawan.class);
    	System.out.println(bean);
    }
}
