package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(config.class);
    	Pawan pawan = app.getBean("obj", Pawan.class);
    	pawan.setId(11);
    	pawan.setName("Ra Krishna");
    	
    	System.out.println(pawan);
    }
}
