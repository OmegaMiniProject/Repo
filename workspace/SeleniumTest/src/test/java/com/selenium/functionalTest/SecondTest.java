package com.selenium.functionalTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTest extends BrowserSetup {
	
	
		
	  @BeforeMethod
	  public void BeforeTest()
	  {
		  
		  BrowserSetup.setup("Chrome");
	  }
	
	
  @Test
  public void secondTestcase() {
  
	  
	  
	 
	
	  
	 //System.setProperty("webdriver.chrome.driver","/SeleniumTest/chromedriver.exe");
	  driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
	  driver.close();
	  
  
  
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
  
  
}
