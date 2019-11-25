package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	
	@FindBy(xpath="//h5[contains(text(),'Personal Information')]")
      WebElement personalInformationText;
	
	@FindBy(xpath="//label[contains(text(),'Full Name')]")
	  WebElement fullNameText;
	
	@FindBy(xpath="//div[@class='col-12 col-md-12 col-sm-12 accout-info-right-l']//input[@id='FirstName']")
	  WebElement userName;
	
	@FindBy(xpath="//h4[contains(text(),'User Information')]")
	  WebElement userInfoText;
	
	@FindBy(xpath="//div[@class='form-group']//label[contains(text(),'Email Id')]")
	  WebElement emailIdText;
	
	@FindBy(xpath="//div[@class='col col-md-12 col-sm-12 accout-info-right-l']//input[@id='FirstName']")
	  WebElement userEmail;
	
	@FindBy(xpath="//h4[contains(text(),'Available KPoints')]")
	  WebElement kpointsText;
	
	@FindBy(xpath="//div[@class='row pb-20 pt-30']//label[@class='mb-1 pt-1'][contains(text(),'You have')]")
	  WebElement kpointsCount;
	
	@FindBy(xpath="//h4[contains(text(),'Newsletters')]")
	  WebElement newslettersText;
	
	@FindBy(xpath="//button[@class='btn btn-sign']")
	  WebElement unsubscribeButton;
	
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validatePersonalInfoText()
	{
		return personalInformationText.getText();
	}
	
	public String validateFullnameLabel()
	{
		return fullNameText.getText();
	}
	
	public String validateFullnameText()
	{
		return userName.getText();
	}
	
	public String validateUserInfoText()
	{
		return userInfoText.getText();
	}
	
	public String validateEmailIdText()
	{
		return emailIdText.getText();
	}
	
	public String validateUserEmail()
	{
		return userEmail.getText();
	}
	
	public String validateKPointsText()
	{
		return kpointsText.getText();
	}
	
	public String validateKpointsCount()
	{
		return kpointsCount.getText();
	}
	
	public String validateNewslettersText()
	{
		return newslettersText.getText();
	}
	

}
