package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.qa.util.TestUtil;
import com.qa.util.WebEventListener;

public class TestBase {
	
	  public static WebDriver driver;
	  
	  public static Properties prop;
	  
	  public  static EventFiringWebDriver e_driver;
		public static WebDriverEventListener eventListener;

	
  public TestBase()
  {
	 
	try {
		
		 prop = new Properties();
		 
		 FileInputStream ip = new FileInputStream("C:\\Users\\subham\\eclipse-workspace\\QATestAutomation\\src\\main\\java\\com\\qa\\config\\config.properties");
		 
		 prop.load(ip);
		 	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}
  
	public static void intialization() throws InterruptedException {
		
		String browserName = prop.getProperty("browser");
		
		
		 if(browserName.equals("Chrome"))
		 {
			// Here we need to set the system property for chrome
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\subham\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
	
		 }
		 else
			 {
			 
			 System.setProperty("webdriver.gecko.driver","D:\\Subham Files\\Selenium\\Firefox\\geckodriver.exe");
				
				driver = new FirefoxDriver();
		 }
		 
		 
		 
		 // Here are creating the object of event handling to register with EventFirig WebDriver
		 
		 e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;
			
			 
		   // Here we will maximize the browser window
		
		    driver.manage().window().maximize();
		    
		 // Here we are declaring the cookies
			   
			   driver.manage().deleteAllCookies();
		    
		    
		    // Here we are calling the page load time out from the TestUtil class
		
		   driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		   
		   
		// Here we are calling the Implicitly wait from the TestUtil class
		   
		   driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		   
		   
		    
		   driver.get(prop.getProperty("url"));
		   Thread.sleep(4000);
		    
	}
}
