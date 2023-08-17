package com.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateExample extends BaseDriver {

	public String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
    
	@Test
	public void NavigateTest() throws InterruptedException {
		driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        List<WebElement> iframeNumber = driver.findElements(By.tagName("iframe"));

        System.out.println(iframeNumber.size());
        driver.switchTo().frame("classFrame");
        WebElement tree = driver.findElement(By.xpath("//header[@role='banner']/nav/div[1]/div[1]/ul/li[5]"));
        tree.click();

        Thread.sleep(3000);

		//backward
		driver.navigate().forward();
		Thread.sleep(2000);
		//forward
		driver.navigate().back();
		Thread.sleep(2000);
		//page refresh
		driver.navigate().refresh();
		Thread.sleep(2000);

		//navigate to
		driver.navigate().to("https://demoqa.com/text-box");;
		Thread.sleep(3000);
	}
}