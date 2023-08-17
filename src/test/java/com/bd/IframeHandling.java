package com.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeHandling extends BaseDriver {
	
	public String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	
	@Test
	public void iframeTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        List<WebElement> iframeNumber = driver.findElements(By.tagName("iframe"));

        System.out.println(iframeNumber.size());
        driver.switchTo().frame("classFrame");
        WebElement tree = driver.findElement(By.xpath("//header[@role='banner']/nav/div[1]/div[1]/ul/li[5]"));
        tree.click();

        Thread.sleep(3000);

        /* 
         * one iframe to -> another iframe
         * have to return parent Frame
         * then use -> driver.switchTo().parentFrame();
         */
        driver.switchTo().parentFrame();

        driver.switchTo().frame("packageListFrame");
        WebElement allClasses = driver.findElement(By.xpath("//a[contains(text(),'All Classes')]"));
        allClasses.click();

        Thread.sleep(3000);
    }
}