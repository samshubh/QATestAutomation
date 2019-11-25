package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	// First We have to create the WebElements  == Object Repository
	
	@FindBy(xpath="//div[@class='col-lg-3 col-xl-3 col-md-3 col-sm-4 col-4 logo-block navbar-left order-aline-1 ng-scope']//img")
       WebElement kiposLogo;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//span[@class='btn btn-login'][contains(text(),'Signup')]")
	  WebElement signupButton;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//span[@class='btn btn-sign'][contains(text(),'Login')]")
	  WebElement loginButton;
	
	@FindBy(xpath="//section[@class='banner-block container pt-30 ng-scope']//h3[contains(text(),'PROTEIN BOWLS')]")
	  WebElement gourmetCategoryText;
	
	@FindBy(xpath="//body[@id='fpws']/div/section[1]/div[1]/div[1]/div[1]")
	  WebElement gourmetSection;
	
	
       // Now we have to initialize the Elements by creating constructor
	
	   // We can initialize all the elements by using PageFactory class
	
	  public HomePage()
	  
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  // Now we have to define various actions on this page 
	  
	    public boolean validateKiposLogo()
	    {
	    	 return kiposLogo.isDisplayed();
	    }
	    
	    public String validateTitle()
	    {
	    	 return driver.getTitle();
	    }
	    
	    public String validatesignUpButtonText()
	    {
	    	  return signupButton.getText();
	    	 
	    	  
	    }
	    
	    public String validateloginButtonText()
	    {
	    	return loginButton.getText();
	    	
	    	
	    }
	    
	    public String validateGourmetSectionText()
	    {
	    	 return gourmetCategoryText.getText();
	    
	    }
	    
	    public ProductsPage validateGourmetSectionClick() throws InterruptedException
	    {
	    	gourmetSection.click();
	    	
	    	Thread.sleep(4000);
	    	
	    	return new ProductsPage();
	    }
	    
	    public LandingPage validateLoginButtonTest() throws InterruptedException
	    {
	    	loginButton.click();
	    	
	    	Thread.sleep(4000);
	    	
	    	return new LandingPage();
	    }
	    
	    
	    public SignUpPage validateSignUpButton() throws InterruptedException
	    {
	    	signupButton.click();
	    	
	    	Thread.sleep(4000);
	    	
	    	return new SignUpPage();
	    	
	    }
}

