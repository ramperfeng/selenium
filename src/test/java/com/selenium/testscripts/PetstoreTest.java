package com.selenium.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.pages.Detailpage;
import com.selenium.pages.FishCategory;
import com.selenium.pages.LandingPage;
import com.selenium.util.BaseClass;

public class PetstoreTest  {
	
	BaseClass b=new BaseClass();
	@BeforeMethod
	public void openApp(){
		b.openBrowser("chrome");
	}	 
	@Test
	public void addPetstore() throws InterruptedException
	{	
		
		// This elements are belongs to landing page
		/*LandingPage lp=PageFactory.initElements(b.driver, LandingPage.class);
		lp.NewItems.click();
		lp.ShopbyBrand.click();		
		lp.mousoverBirds(b.driver);
		lp.mousoverFish(b.driver);
		lp.mousoverCat(b.driver);
		*/
		
		//This elements belongs to fish and it's subcategory 
		FishCategory fish=PageFactory.initElements(b.driver, FishCategory.class);
		fish.mousoverFish(b.driver);
	}
	
	@AfterMethod
	public void teardown(){
		b.closebrowser();
	}
	
}
