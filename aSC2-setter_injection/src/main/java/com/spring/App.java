package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student)appCon.getBean("std");
        System.out.println(s);
    }
}
