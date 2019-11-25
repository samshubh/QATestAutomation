package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ForgotPassword extends TestBase {

	
	@FindBy(xpath = "//h5[contains(text(),'Forgot my password')]")
	  WebElement forgotPasswordText;
	
	@FindBy(id ="emailForgot")
	  WebElement emailIdForgot;
	  
	@FindBy(xpath="//div[@class='form-group']//button[contains(@class,'pull-right btn-action btn btn-cart btn-kipos')][contains(text(),'Confirm')]")
	 WebElement forgotSubmit;
	
	
	public ForgotPassword()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String  validateForgotPasswordText()
	{
		 return forgotPasswordText.getText();
	}
	
	public void validateEmailid(String user) throws InterruptedException
	{
		emailIdForgot.sendKeys(user);
		Thread.sleep(4000);
	}
	
	public HomePage submitButton()
	{
		forgotSubmit.click();
		
		return new HomePage();
		
	}
}
