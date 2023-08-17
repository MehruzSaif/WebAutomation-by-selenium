package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseDriver {
	String daraz = "https://www.daraz.com.bd/";

	@Test
	public void assertionTest() throws InterruptedException {
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String expectedTitle = "Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
		String actualTitle = driver.getTitle();

		/*
		 * 2 types of Assertion -> Hard & Soft
		 * Hard Assertion -> if fail: next no execution
		 */
		// Assert.assertEquals(actualTitle, expectedTitle);

		/*
		 * Soft Assertion -> if fail or error: no problem
		 * 1st do the rest of the task then show the error in console
		 */
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);

		WebElement sellOnDaraz = driver.findElement(By.xpath("//div[@id='J_LzdSiteNav']/div/div[1]/div/div/div[1]/div/div[3]/a"));
		sellOnDaraz.click();
		Thread.sleep(5000);

		soft.assertAll();
	}
}