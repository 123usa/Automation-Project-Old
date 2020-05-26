package com.wbl.AutomationFramework1;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.base.CommonPage;
import com.wbl.pages.HomePage;

public class HomePageTest  extends BaseTest
{
	HomePage hm;
	@BeforeMethod
	 public void beforeMethod()
	 {
		hm=new HomePage(driver);
	 }
	
	
	
	@Test
	 public void headerNavLinkTest()
	 {
		 int actual=hm.headerNavLinks();
		Assert.assertEquals(0,actual);
		 
	 }
	
	
	
	
	
	
	@Test
	public void searchTest()
	{
		//hm=new HomePage(driver);
		String actual=hm.search("Laptop");
		//#global-search-form > button.a3PP_I.a12d_1.mweb-Typeahead-cancel.cP_v1driver.mange().timeouts.implicitlywait(50)
		//Assert.assertEquals( "Laptop - Walmart.com",actual);
Assert.assertEquals("Amazon.com: Laptop",actual);
	//	+ "- Laptops / Computers & Tablets: Electronics", actual);
	
	
		//#global-search-submit .owMkH}




   


	
	}
	
	@Test
	
public void footerlinksTest()

{
	    int actual = hm.footerlinks();
		
		Assert.assertEquals(4,actual);	

}


/*@Test 
public void slideimageTest()
{

Assert.assertEquals(128,hm.slideimages());	
	
	
}*/


 

}
