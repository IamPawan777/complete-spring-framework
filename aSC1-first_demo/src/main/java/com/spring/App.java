package com.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )   {   
    	
//    	This example is make program loosely couple.........
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter bulb name which you want to need: ");
    	String name = scanner.next();
    	
    	Servics sc = new Servics();
    	System.out.println(sc.ask(name));
    	
    	
    	//ApplicationContext con = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//Servics ser = (Servics)con.getBean("sp");
    	//System.out.println(ser.ask());    	
    }
}
