package com.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TableHandling extends BaseDriver{

	public static String baseUrl= "https://testautomationpractice.blogspot.com/";
	
	@Test
	public void tableTest() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement moveElement = driver.findElement(By.xpath("//table[@name='BookTable']"));
		actions.moveToElement(moveElement).perform();
		Thread.sleep(2000);
		
		List<WebElement> tableList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Size: "+tableList.size());

		List<WebElement> valueList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td"));
		System.out.println(valueList.size());

		for (int i = 2; i <= tableList.size(); i++) {
			WebElement bookName = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td[1]"));
			for (int j = 1; j <= valueList.size(); j++) {
				WebElement value = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(value.getText()+" | ");
			}
			System.out.println();
		}
	}
}