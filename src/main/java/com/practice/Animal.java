package com.practice;//collection of classes

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Animal {//collection of objects
	
	
	//object = instance of class
	//cucumber step def = always void & no static
	
	
	public void openBrowser() {//void method
		//selenium code
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tefa2/Downloads/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
		driver.manage().window().maximize();
		driver.quit();
		
	}//method void end
	//*****only main method can run code in java
	
	public static void main(String[] args) {
		//call void method setup & run
		// method level = class/object
		//static yes = method is class level >> ClassName.methodName();
		//no static = method is object level >> objectName.methodName();
		
		Animal obj = new Animal();
		obj.openBrowser();
		
		
	}

}//class end
