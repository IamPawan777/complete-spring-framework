package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee)appCon.getBean("emp");
        
        System.out.println(emp);
    }
}
