package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext app = new ClassPathXmlApplicationContext("applicationConfig.xml");
    	Pawan ex = app.getBean("pa", Pawan.class);
    	System.out.println(ex);
    	System.out.println(ex.getCourse());
    	
    	// find bean scope
    	Pawan a1 = app.getBean("pa", Pawan.class);
    	Pawan a2 = app.getBean("pa", Pawan.class);
    	System.out.println(a1.hashCode());
    	System.out.println(a2.hashCode());
    	
    }
}
