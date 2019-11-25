package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ForgotPassword;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ForgotPasswordTest extends TestBase {
	
	ForgotPassword forgotpassword;
	HomePage homepage;
	LoginPage loginpage;
	
	
	public ForgotPasswordTest()
	{
		super();
		
	}

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		intialization();
		
		forgotpassword = new ForgotPassword();
		
		homepage = new HomePage();
		
		homepage.validateLoginButtonTest();
		
		loginpage = new LoginPage();
		
		loginpage.validateForgotPasswordLink();
		
	}
	
	
	 @Test(priority = 1)
	 public void verifyForgotPasswordText() {
		
		String text = forgotpassword.validateForgotPasswordText();
		
		Assert.assertEquals(text,"Forgot my password", "String message is not matched");
		
	}
	 
	 @Test(priority = 2)
	 public void verifyEmailidField() throws InterruptedException
	 {
		 forgotpassword.validateEmailid(prop.getProperty("username"));
	 }
	
	@Test(priority = 3)
	public void verifySubmitButton() throws InterruptedException
	{
		forgotpassword.validateEmailid(prop.getProperty("username"));
		
		homepage = forgotpassword.submitButton();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
