package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignUpPage extends TestBase {
	

	
	@FindBy(xpath="//h5[contains(text(),'Account')]")
	  WebElement signUpText;
	
	@FindBy(id="signup-fullname")
	  WebElement fullName;
	
	@FindBy(id="signup-email")
	 WebElement userEmail;
	
	@FindBy(id="password")
	 WebElement userPassword;
	
	@FindBy(id="changepwd-confirm-password")
	  WebElement userConfirmPassword;
	
	@FindBy(xpath="//div[@id='signup-submit']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Submit')]")
	  WebElement signUpSubmit;
	
	public SignUpPage()
	{
		PageFactory.initElements(driver,this);
	}
  
	
    public String  validateSignUpText()
    {
    	return signUpText.getText();
    }
    
    public LandingPage validateSignUp(String fullname,String emailid,String password,String confirmpassword) throws InterruptedException
    {
    	fullName.sendKeys(fullname);
    	 Thread.sleep(3000);
   
    	userEmail.sendKeys(emailid);
    	Thread.sleep(3000);
    
    	userPassword.sendKeys(password);
    	Thread.sleep(3000);
   
    	userConfirmPassword.sendKeys(confirmpassword);
    	
    	Thread.sleep(3000);
  
    	signUpSubmit.click();
    	
    	return new LandingPage();
    }
}
