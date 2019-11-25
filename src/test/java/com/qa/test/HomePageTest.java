package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LandingPage;
import com.qa.pages.ProductsPage;
import com.qa.pages.SignUpPage;

public class HomePageTest extends TestBase{
	
	HomePage homepage = new HomePage();
	
	ProductsPage productspage = new ProductsPage();
	
	LandingPage landingpage;
	
	SignUpPage signuppage;
	
	
	
	// Here we are creating the constructor of the parent class(TestBase) to access all the variables and methods
		public HomePageTest()
		{
			super();
		}
		
		
	// First we have to initialize the system property from Test Base class by calling initialization method
	@BeforeMethod
	  public void setUp() throws InterruptedException
	  
	  {
		intialization();
		
		
		//After initialization we have to create the object of homepage
		homepage = new HomePage();
		
	  }
	
	
    
	 @Test(priority=1)
	   public void kiposLogoTest()
	   {
		 boolean b = homepage.validateKiposLogo();
		 
		 Assert.assertTrue(b);
	   }
	 
      @Test(priority=2)
       public void kiposTitleTest()
       {
    	  String title = homepage.validateTitle();
    	  
    	  Assert.assertEquals(title, "Kipos Collective");
       }
      
      @Test(priority=3)
        public void signUpButtonTest()
        {
    	  String signupText = homepage.validatesignUpButtonText();
    	  
    	  
    	  Assert.assertEquals(signupText, "Signup");
        }
      
       
      @Test(priority=4)
      public void loginButtonText()
      {
  	  String loginText = homepage.validateloginButtonText();
 
  	      Assert.assertEquals(loginText, "Login");
      }
      
      
      @Test(priority=5)
      public void gourmetProductsTextTest() throws InterruptedException
      {
    	 
    	
  	         String gourmetText = homepage.validateGourmetSectionText();
 
  	      Assert.assertEquals(gourmetText, "GOURMET – PROTEIN BOWLS");
      }
      
      @Test(priority=6)
      public void gourmetProductsTest() throws InterruptedException
      {

    	 productspage = homepage.validateGourmetSectionClick();
      }
      
      @Test(priority = 7)
      
       public void loginButtonTest() throws InterruptedException
       {
    	 landingpage= homepage.validateLoginButtonTest();
    	  
       }  
      
      @Test(priority = 8)
        public void verifySignUpButton() throws InterruptedException {
    	  
    	 signuppage = homepage.validateSignUpButton();
      }
      
      
      @AfterMethod
        public void tearDown() {
    	   driver.quit();
      }
}
