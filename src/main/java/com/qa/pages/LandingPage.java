package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LandingPage extends TestBase {
	
	
	
	
	@FindBy(xpath="//div[@class='col-lg-3 col-xl-3 col-md-3 col-sm-4 col-4 logo-block navbar-left order-aline-1 ng-scope']//img")
    WebElement kiposLogo;
	
	@FindBy(xpath="//div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']//a[@class='dropdown-toggle text-cart ng-binding'][contains(text(),'Jayashankar')]")
	WebElement usernameText;
	
	@FindBy(xpath="//body[@id='fpws']/header/div[@class='top-navigation']/nav[@id='myHeader']/div[@class='container']/div[@class='desktop-header']/div[@class='row']/div[@class='col-lg-4 col-xl-4 col-md-5 col-sm-4 col-8 sign-right order-aline-2 ng-scope']/div[@class='ng-scope']/div[@class='float-right top-nav']/ul[@class='nav navbar-nav']/span[@class='cart-mobile-items']/span[1]")
	 WebElement cartItemCount;
	
	@FindBy(xpath="//body[@id='fpws']/div/section[1]/div[1]/div[1]/div[1]")
	  WebElement gourmetSection;
	
	@FindBy(xpath="//ul[@class='dropdown-menu show']//a[contains(text(),'My Account')]")
      WebElement myAccount;
	
	
	public LandingPage()
	{
		PageFactory.initElements(driver,this);
	}

	
	  public boolean validateKiposLogo()
	  {
		   return kiposLogo.isDisplayed();
	  }
	  
	  public String validateUsername()
	  {
		   return usernameText.getText();
		  
	  }
	  
	  public String validateCartItemCount()
	  {
		   return cartItemCount.getText();
		   
		    
	  }
	  
	  public ProductsPage validateGourmetSectionClick()
	  {
		  gourmetSection.click();
		  
		  return new ProductsPage();
	  }
	  
	  public void validateUserOptions() throws InterruptedException
	  {
		    usernameText.click();
		    Thread.sleep(4000);
		  
	  }
	  
	  public MyAccountPage validateMyAccountClick() throws InterruptedException
	  {
		  myAccount.click();
		  
		  Thread.sleep(4000);
		   return new MyAccountPage();
	  }
	  
	  
}
