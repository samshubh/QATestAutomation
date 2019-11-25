package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	
	MyAccountPage myaccountpage;
	LandingPage landingpage;
	HomePage homepage;
	LoginPage loginpage;
	
	
	
	
	
	public MyAccountPageTest()
	{
		super();
		
	}
	
	
	
	@BeforeMethod
	 public void setUp() throws InterruptedException
	 {
		intialization();
		
		myaccountpage = new MyAccountPage();
		
		   
  	  landingpage = new LandingPage();
  	 
  	  homepage = new HomePage();
  	  loginpage = new LoginPage();
  	  
  	  homepage.validateLoginButtonTest();
  	  
  	   landingpage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
  	   
  	   landingpage.validateUserOptions();
  	   
  	    Thread.sleep(4000);
  	     landingpage.validateMyAccountClick();
		
	 }
	
	
	@Test(priority=1)
     public void verifyPersonalInfoText()
     {
		String personalInfo = myaccountpage.validatePersonalInfoText();
		
		  System.out.println(personalInfo);
		
     }
	

	@Test(priority=2)
     public void verifyFullnameLabel()
     {
		String fullNameLabel = myaccountpage.validateFullnameLabel();
		
		  System.out.println(fullNameLabel);
		
     }
	

	@Test(priority=3)
     public void verifyFullnameText()
     {
		String fullName = myaccountpage.validateFullnameText();
		
		  System.out.println(fullName);
		
     }
	

	@Test(priority=4)
     public void verifyUserInfoText()
     {
		String userInfoText = myaccountpage.validateUserInfoText();
		
		  System.out.println(userInfoText);
		
     }
	

	@Test(priority=5)
     public void verifyEmailIdText()
     {
		String emailIdText = myaccountpage.validateEmailIdText();
		
		  System.out.println(emailIdText);
		
     }
	

	@Test(priority=6)
     public void verifyUserEmail()
     {
		String userEmail = myaccountpage.validateUserEmail();
		
		  System.out.println(userEmail);
		
     }
	

	@Test(priority=7)
     public void verifyKPointsText()
     {
		String kpointsText = myaccountpage.validateKPointsText();
		
		  System.out.println(kpointsText);
		
     }
	

	@Test(priority=8)
     public void verifyKpointsCount()
     {
		String kpointsCount = myaccountpage.validateKpointsCount();
		
		  System.out.println(kpointsCount);
		
     }
	

	@Test(priority=9)
     public void verifyNewslettersText()
     {
		String newslettersText = myaccountpage.validateNewslettersText();
		
		  System.out.println(newslettersText);
		
     }
	
	 @AfterMethod
	  public void tearDown()
	  {
		 driver.quit();
	  }

}
