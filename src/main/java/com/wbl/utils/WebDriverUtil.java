package com.wbl.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil 
{
	  
	public static WebDriver getDriver(String browsername)  
	
	{
	
	WebDriver driver = null;
	   



	  try {
		  
		  switch(browsername)
		  {
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Resources/Drivers/chromedriver.exe");
			  driver =new ChromeDriver();
			  
			  		  
			  break;
		  case "firefox":
			  
		  
		     System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Resources/Drivers/geckodriver.exe");


		    
          driver=new FirefoxDriver();


         break;
         case "ie" :
        	  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Resources/Drivers/IEDserver.exe");  
		      driver = new ChromeDriver();


        	  
        	  
        	  
        	  break;
		  
		  default:
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Resources/Drivers/chromedriver.exe");
			  driver =new ChromeDriver();
		  
		  
		  
		  
		  }
		  
		  
	  }catch(Exception e)
	  {

		  System.out.println("there is an exceptin when creating webDriver object");

           System.out.println(e.getStackTrace());

	  }
	  return driver;
	  
		  
		  
	  }
	
	
	
	
	
	}
