package com.wbl.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.base.CommonPage;

public class HomePage  extends CommonPage {

	public HomePage(WebDriver driver) {
		super(driver);


	}
	
	 public String search(String searchdata)
	   
	   {
		//  driver.findElement(By.id("global-search-input")).sendKeys(searchdata);
		
		 
		 
		 
		 
		 //  driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();

		 
		// driver.findElement(By.cssSelector("[class='vhf-icn vhf-icn-search-nav vhf-icn-18']")).click();
	//	 driver.findElement(By.id("global-search-input")).sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchdata);
	  




driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();	
		  
		  
		  




				  
			//	  (".header-globalsearch-submit.btn")).click();
		  	return   driver.getTitle();	

	   }



	 
	 
	public int headerNavLinks()
	{
      
	 return  driver.findElements(By.name("nav-a")).size();

	 
	}
	 

/*	public int slideimages()
	 {
		 return driver.findElements(By.className("product-image")).size();
	 }*/
	public int footerlinks()
{
  return driver.findElements(By.className("navFooterColHead")).size();
		  




		  }
	   
	   }


	
	
	



