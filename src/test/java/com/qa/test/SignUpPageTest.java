package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	
	SignUpPage signuppage;
	HomePage homepage;
	
	LandingPage landingpage;
	
	
	public SignUpPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
     public void setup() throws InterruptedException
     {
		intialization();
		
		signuppage = new SignUpPage();
		  homepage = new HomePage();
		  
		  homepage.validateSignUpButton();
		  

     }
	
	@Test(priority=1)
	  public void verifySignUpText()
	  {
		String text= signuppage.validateSignUpText();
		
//		Assert.assertEquals(text, "Account");
		
	  } 
	
	 @Test(priority=2)
	public void validateSignUp() throws InterruptedException
	{
	 
		  signuppage.validateSignUp(prop.getProperty("Fullname"), prop.getProperty("Email"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword"));
		  
	    }
	  

	  @AfterMethod
	   public void tearDown()
	   {
		  driver.quit();
	   }
}
