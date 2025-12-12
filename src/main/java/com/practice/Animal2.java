package com.practice;//all lower

public class Animal2 {//1st letter upper
	
	//int=10;//whole number
	//double=2.75;//decimal numbers
	//char=Letters;//character or words
	//String="double quotation";//anything in double quotes
	//old java (1-7): object(parent/boss) = anything int/double/char/String
	//new java (8-25): Var(parent/boss) = anything int/double/char/String
	
	//String user = "Batch44"; //user = variable/literal
	//String pass = "student123@"; //pass = variable/literal
	
	String burger = "$10";
	String ticket = "$3";
	
	public void getLogin() {//1st letter lower / method static = no
		
		//body = code
		Human obj2 = new Human();
		System.out.println("My burger is " + burger);
		System.out.println("My ticket costs " + ticket);
		
	}//end method
	//any java reserve keyword = all lower
	public static void main(String[] args) {
		//1st static = No ==> object level
		Animal2 dog = new Animal2(); //1st letter lower
		dog.getLogin();
		
		//if static is yes
		//System.out.println("My burger is " + burger); 
		//System.out.println("My ticket costs " + ticket);
		
		//when its not static
		System.out.println("Burger price = " +dog.burger);
		System.out.println("Ticker price = " +dog.ticket);

	}

}//class end
