package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorIdentify extends BaseDriver {

	String url = "https://login.yahoo.com/";
	String daraz = "https://www.daraz.com.bd/";

	@Test
	public void testLocator() throws InterruptedException {
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(3000);

		/*
		 * Identify locator by ID
		 */
		WebElement loginByID = driver.findElement(By.id("login-username"));
		loginByID.sendKeys("abc@yahoo.com");
		

		/*
		 * Identify locator by Class
		 */
		WebElement loginByClass = driver.findElement(By.className("phone-no"));
		loginByClass.sendKeys("abc@yahoo.com");
		

		/*
		 * Identify locator by Name
		 */
		WebElement loginByName = driver.findElement(By.name("username"));
		loginByName.sendKeys("extremearnob007@yahoo.com");
		
		WebElement nextButton = driver.findElement(By.id("login-signin"));
		nextButton.click();
		
		/* <----------------------------------XPath-----------------------------------> */

		// Formula of xpath: //TagName[@attribute='value']

		/* by /TagName[@attribute='value'] -------> but it didn't work */
		WebElement signUpByFormulaXpath = driver.findElement(By.xpath("//a[@data-spm-anchor-id='a2a0e.home.header.d5']"));
		signUpByFormulaXpath.click();
		
		/* 
		 * Contains Method Xpath
		 */
		WebElement signUpByContainsMethodXpath = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signUpByContainsMethodXpath.click();

		/* 
		 * Custom Xpath example 1 by click on Sell on Daraz
		 */
		WebElement sellOnDarazByCustomXpath = driver.findElement(By.xpath("//div[@id='J_LzdSiteNav']/div/div[1]/div/div/div[1]/div/div[3]/a"));
		sellOnDarazByCustomXpath.click();

		/* 
		 * Custom Xpath example 1 by click on SignUp/Login
		 */
		WebElement signupLoginCustomXpath = driver.findElement(By.xpath("//div[@id='J_LzdSiteNav']/div/div[1]/div/div/div[1]/div/div[6]/a"));
		signupLoginCustomXpath.click();

		Thread.sleep(5000);
	}

}