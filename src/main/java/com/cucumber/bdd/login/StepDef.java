package com.cucumber.bdd.login;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basic.java.practice.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	PageFactory pf;
	
	@Given ("opened the browser")
	public void goBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Given ("go to application login page")
	public void goApp() {
		pf = new PageFactory();
		driver.navigate().to(pf.getApplinq());
		
	}
	
	@When ("enter Username {string}")
	public void enterUser(String Username) {
		driver.findElement(By.xpath(pf.getUser())).sendKeys(Username);
		
	}
	
	@When ("enter Password {string}")
	public void enterPass(String Password) {
		driver.findElement(By.xpath(pf.getPass())).sendKeys(Password);
		
	}
	
	@When ("click the login button")
	public void clickLogin() {
		driver.findElement(By.xpath(pf.getLoginBtn())).click();
		
	}
	
	@Then ("check login pass or fail")
	public void loginStatus() {
		try {
		boolean logoutBtnStatus = driver.findElement(By.xpath(pf.getLogoutBtn())).isDisplayed();
			  System.out.println("Logout btn is displayed = " + logoutBtnStatus);
		  } catch (Exception e) {
		  }
		  	  driver.quit(); 
		
	}
	
	
	
//	@Given("opened the browser")
//	public void opened_the_browser() {
//	  driver = new ChromeDriver();
//	  driver.manage().window().maximize();
//	   
//	}
//
//	@Given("go to application login page")
//	public void go_to_application_login_page() {
//	  driver.get("file:///C:/Users/tefa2/Downloads/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html");
//	    
//	}
//
//	@When("enter valid username")
//	public void enter_valid_username() {
//	  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch44"); 
//	    
//	}
//
//	@When("enter valid password")
//	public void enter_valid_password() {
//	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");   
//	    
//	}
//
//	@When("click the login button")
//	public void click_the_login_button() {
//	  driver.findElement(By.xpath("//*[@value='Login']")).click();  
//	    
//	}
//
//	@Then("login should pass & logout button should be visible")
//	public void login_should_pass_logout_button_should_be_visible() {
//	  boolean logoutBtnStatus = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
//	  System.out.println("Logout btn is displayed = " + logoutBtnStatus);
//	  driver.quit();
//	  
//	}
//
//	@When("enter invalid username")
//	public void enter_invalid_username() {
//	  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("wronguser");  
//	    
//	}
//
//	@When("enter invalid password")
//	public void enter_invalid_password() {
//	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("wrongpass");  
//	    
//	}
//
//	@Then("login should fail & invalid username or password message should be visible")
//	public void login_should_fail_invalid_username_or_password_message_should_be_visible() {
//	  try {
//		boolean logoutBtnStatus = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
//		  System.out.println("Logout btn is displayed = " + logoutBtnStatus);
//	  } catch (Exception e) {
//	  }
//	  	  driver.quit();  
//	    
//	}
//
//	@When("enter null username")
//	public void enter_null_username() {
//	  driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");  
//	    
//	}
//
//	@When("enter null password")
//	public void enter_null_password() {
//	  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");  
//	    
//	}
//	
//	@When("enter Username {string}")
//	public void enterUsername(String username) {
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
//	    
//	}
//	
//	@When("enter Password {string}")
//	public void enterPassword(String password) {
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
//	    
//	}
//
//	@Then("check login pass or fail")
//	public void check_login_pass_or_fail() {
//		try {
//			boolean logoutBtnStatus = driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed();
//			  System.out.println("Logout btn is displayed = " + logoutBtnStatus);
//		  } catch (Exception e) {
//		  }
//		driver.quit(); 
//	    
//	}

}
