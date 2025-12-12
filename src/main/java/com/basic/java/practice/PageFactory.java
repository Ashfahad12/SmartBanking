package com.basic.java.practice;

public class PageFactory {
	
	private String Applinq = "file:///C:/Users/tefa2/Downloads/qa_online%20Banking%20monthly_yearly%20statement%20-bug%20fixed.html";
	private String User = "//*[@id='username']";	
	private String Pass = "//*[@id='password']";
	private String LoginBtn = "//*[@value='Login']";
	private String LogoutBtn = "//*[@id='logoutButton']";
	
	public String getApplinq() {
		return Applinq;
	}
	public String getUser() {
		return User;
	}
	public String getPass() {
		return Pass;
	}
	public String getLoginBtn() {
		return LoginBtn;
	}
	public String getLogoutBtn() {
		return LogoutBtn;
	}
	
}
