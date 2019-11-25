package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	
	 public static WebDriver driver;
	
	// Here we are declaring it as public so that it can be accessible everywhere in the class
	// If we declare the variable as static, then no need of creating the object directly we can access by ClassName.variable
	
	 public  static long  PAGE_LOAD_TIMEOUT = 30;
	
	  public static long  IMPLICITLY_WAIT= 20;

	public static void takeScreenshotAtEndOfTest() throws IOException {
		// TODO Auto-generated method stub
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   
		   FileUtils.copyFile(src, new File("D:\\Example.png"));
	}

}
