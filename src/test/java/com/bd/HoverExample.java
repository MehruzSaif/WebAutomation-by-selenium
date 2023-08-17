package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverExample extends BaseDriver {
	String daraz = "https://www.daraz.com.bd/";

	@Test
	public void assertionTest() throws InterruptedException {
		driver.get(daraz);
		driver.manage().window().maximize();
		Thread.sleep(5000);

		Actions action = new Actions(driver);

		//For Hover => action.moveToElement().perform()
		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		action.moveToElement(electronic).perform();

		WebElement smartPhone = driver.findElement(By.xpath("//span[contains(text(),'Smartphones')]"));
		action.moveToElement(smartPhone).perform();

		WebElement realmePhone = driver.findElement(By.xpath("//span[contains(text(),'realme Phones')]"));
		realmePhone.click();

		Thread.sleep(5000);
	}
}