package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.LoginPage;
import com.qa.pages.MyAccountPage;
import com.qa.pages.ProductsPage;

public class LandingPageTest extends TestBase {
	
	
	LandingPage landingpage;
	HomePage homepage;
	LoginPage loginpage;
	 ProductsPage productspage;
	 MyAccountPage myaccountpage;
	
	
      public LandingPageTest() {
    	  
    	  super();
    	  
      }
      
      
      @BeforeMethod
        public void setUp() throws InterruptedException
        {
    	  intialization();
    	  
    	   
    	  landingpage = new LandingPage();
    	 
    	  homepage = new HomePage();
    	  loginpage = new LoginPage();
    	  
    	  homepage.validateLoginButtonTest();
    	  
    	   landingpage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    	  
        }
      
      
      
      @Test(priority=1)
        public void verifyLogo()
        {
    	 boolean b= landingpage.validateKiposLogo();
    	   
    	  Assert.assertTrue(b);
        }
      
      
      @Test(priority=2)
        public void verifyUserName()
        {
    	  String user= landingpage.validateUsername();
    	  
    	  System.out.println(user);
        }
      
      
      @Test(priority=3)
        public void verifyCartCount()
        {
    	  String count = landingpage.validateCartItemCount();
    	    System.out.println(count);
    	  
        }
      
      
      @Test(priority=4)
        public void verifyGourmetClick()
        {
    	  productspage=  landingpage.validateGourmetSectionClick();
        }
      
      @Test(priority=5)
      public void verifyUserOptions() throws InterruptedException
      {
  	     
      }
      
      @Test(priority=6)
      public void verifyMyAccount() throws InterruptedException
      {
    	  
    	  landingpage.validateUserOptions();
    	  
  	      myaccountpage = landingpage.validateMyAccountClick();
      }
      
      
      @AfterMethod
        public void tearDown()
        {
    	  driver.quit();
        }
}
