package com.wbl.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage {

   protected WebDriver driver;
    public CommonPage(WebDriver driver)
    
    {
    	this.driver=driver;
    }

 


  /*  public String search(String searchdata)
	   
	   {
		//  driver.findElement(By.id("global-search-input")).sendKeys(searchdata);
		
		 
		 
		 
		 
		 //  driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();

		 
		// driver.findElement(By.cssSelector("[class='vhf-icn vhf-icn-search-nav vhf-icn-18']")).click();
	//	 driver.findElement(By.id("global-search-input")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchdata);
	  




driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();	
		  
		  
		  




				  
			//	  (".header-globalsearch-submit.btn")).click();
		  	return   driver.getTitle();	

	   }*/


}
