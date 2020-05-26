package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.wbl.utils.WebDriverUtil;

public class BaseTest {
	
	
	protected WebDriver driver;
	
	

  @BeforeMethod

   public void beforeClass()
   {

driver = WebDriverUtil.getDriver("chrome");

driver.get("https://www.walmart.com/");

//String URL=configuration.URL
   
   }


  @AfterClass

   public void afterClass() {
	   


	  driver.quit();
   

 }





}
   
