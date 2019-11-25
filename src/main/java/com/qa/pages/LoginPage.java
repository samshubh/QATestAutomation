package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	@FindBy(id="email")
     WebElement emailid;
	 
	@FindBy(id="password_login")
	  WebElement emailpassword;
	
	@FindBy(xpath="//form[@id='vm.frmLogin']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Submit')]")
	 WebElement submit;
	
	@FindBy(xpath = "//a[@class='need-help']")
	  WebElement forgotPasswordLink;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
    
	 @Test
	
	public LandingPage login(String un, String pwd) throws InterruptedException
    {
    	
    	emailid.sendKeys(un);
    	Thread.sleep(4000);
    	
    	emailpassword.sendKeys(pwd);
    	Thread.sleep(4000);
    	
    	submit.click();
    	Thread.sleep(4000);
    	
    	return new LandingPage();
    	
    }
	 
	 public ForgotPassword validateForgotPasswordLink() throws InterruptedException
	 {
		forgotPasswordLink.click();
		 Thread.sleep(4000);
		return new ForgotPassword();
		
	 }
	
	  
}
