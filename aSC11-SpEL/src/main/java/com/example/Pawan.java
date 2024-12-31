package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pawan {
	
	public static String my_method() {
		return "Static method call";
	}
	
	@Value("#{10+5}")
	private int sum;
	
	@Value("#{10-2}")
	private int sub;
	
	@Value("#{5*5}")
	private int mul;
	
	@Value("#{2/2}")
	private int div;
	
//	@Value("#{5!=5}")
//	@Value("#{5<=5}")
//	@Value("#{9>5}")
	@Value("#{8 ne 2}")			// lt-less then, gt-greater then, eq=equal, le/ge=less/greater then equal, ne=not equal
	private boolean change;
	

	@Value("#{1==5 || 5==5}")			// (||)-OR, (!)-NOT
	private boolean status;

	@Value("#{10>5 ? 'Greater value h' : 'Smaller value h'}")				// ternary
	private String number;
	
	@Value("#{T(java.lang.Math).sqrt(16)}")						// math operation (have to use package)
	private int mat;
	
	
	@Value("#{T(com.example.Pawan).my_method()}")				// static method (have to use package)
	private String result;


	@Override
	public String toString() {
		return "Pawan [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", change=" + change
				+ ", status=" + status + ", number=" + number + ", mat=" + mat + ", result=" + result + "]";
	}


	
}
