package com.selenium.pract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaLooping {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//This code below with 1 forward slash brings 11 menu bar buttons to click, including 2 dropdown button
		List<WebElement> menubar = driver.findElements(By.xpath("//*[@class='nav navbar-nav']/li"));
		
		//This code below with 2 forward slash brings 35 menu bar buttons to click, including all the buttons in each individual dropdown link
		//List<WebElement> menubar = driver.findElements(By.xpath("//*[@class='nav navbar-nav']//a"));
		
		System.out.println(menubar.size());
		
		for(int i = 0; i <menubar.size(); i++) {
			System.out.println(menubar.get(i).getText());
			
		}
		
	}

}
