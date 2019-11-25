package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ForgotPassword;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	  
	LoginPage loginpage;
	LandingPage landingpage;
	 HomePage homepage;
	
	ForgotPassword forgotpassword;

	
	public LoginPageTest() {
		 super();
		 
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		intialization();
		
		loginpage = new LoginPage();
		
		homepage = new HomePage();
		
		homepage.validateLoginButtonTest();
	}
	

	@Test(priority=1)
    public void loginUserTest() throws InterruptedException
    {
		
  	 landingpage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
  	
    }
	
	@Test(priority = 2)
	public void forgotPasswordTest() throws InterruptedException
	{
		forgotpassword = loginpage.validateForgotPasswordLink();
	}
	
	
	@AfterMethod
      public void tearDown()
      {
		driver.quit();
      }
	
}
