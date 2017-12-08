package com.selenium.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.selenium.config.OR;
import com.selenium.util.BaseClass;

public class LandingPage extends BaseClass {
	
	
	Actions a;
	
	@FindBy(xpath=OR.ShopbyBrand)
	public WebElement ShopbyBrand;
	
	@FindBy(xpath=OR.Sale)
	public WebElement Sale;
	
	@FindBy(xpath=OR.NewItems)
	public WebElement NewItems;
	
	@FindBy(xpath=OR.BIRDS)
	public WebElement BIRDS;
	
	public void mousoverBirds(WebDriver driver)
	{
		
		a=new Actions(driver);
		//WebElement bird=BIRDS;
		a.moveToElement(BIRDS).build().perform();
		List<WebElement> category=driver.findElements(By.xpath(OR.Birds_Box));
		
		System.out.println(category.size());
		for (WebElement x:category )
		{
			if(x.getText().equalsIgnoreCase("Food"))
			{
			x.click();
		}
			}
		
	}
	@FindBy(xpath=OR.Fish)
	public WebElement Fish;
	
	public void mousoverFish(WebDriver driver)
	{
		
		a=new Actions(driver);
		//WebElement bird=BIRDS;
		a.moveToElement(Fish).build().perform();
		List<WebElement> category=driver.findElements(By.xpath(OR.Fish_Box));
		
		System.out.println(category.size());
		for (WebElement x:category )
		{
			if(x.getText().equalsIgnoreCase("Fish Food"))
			{
			x.click();
		}
			}
		
	}
	
	@FindBy(xpath=OR.Cat)
	public WebElement Cat;
	
	public void mousoverCat(WebDriver driver)
	{
		
		a=new Actions(driver);
		//WebElement bird=BIRDS;
		a.moveToElement(Cat).build().perform();
		List<WebElement> category=driver.findElements(By.xpath(OR.Cat_Box));
		
		System.out.println(category.size());
		for (WebElement x:category )
		{
			if(x.getText().equalsIgnoreCase("Toys"))
			{
			x.click();
		}
			}
		
	}
	
	
}
