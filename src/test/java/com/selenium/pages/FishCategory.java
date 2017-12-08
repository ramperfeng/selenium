package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.selenium.config.OR;

public class FishCategory {
	
	Actions a;
	
	@FindBy(xpath=OR.Fish)
	public WebElement Fish;
	
	@FindBy(xpath=OR.subcategory)
	public WebElement subcategory;
	public void mousoverFish(WebDriver driver) throws InterruptedException
	{
		
		a=new Actions(driver);
		a.moveToElement(Fish).build().perform();
		Fish.click();
		Thread.sleep(50);
	List<WebElement> category=driver.findElements(By.xpath(OR.subcategory));
	
	System.out.println(category.size());
	for (WebElement x:category )
	{
		if(x.getText().equalsIgnoreCase("Aeration"))
		{
		x.click();
	}
		}
	}
}
