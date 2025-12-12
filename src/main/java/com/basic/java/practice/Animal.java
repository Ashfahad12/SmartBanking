package com.basic.java.practice;

public class Animal {
	//global area = inside class, above method, (AM = any/static=yes/no)
	//a=10
	//b=20
	public int a;
	public int b;
	
	//void method
	public void getValue() {
	//local area = inside method
		
		a = 10;
		b = 20;
		
		System.out.println("Value a is " +a);
		System.out.println("Value b is " +b);
		
	}

}
