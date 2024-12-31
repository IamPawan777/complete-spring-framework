package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("config.xml");
        Student s = appCon.getBean("std", Student.class);
        System.out.println(s);
        
        System.out.println(s.getFees().getClass().getName());
    }
}
