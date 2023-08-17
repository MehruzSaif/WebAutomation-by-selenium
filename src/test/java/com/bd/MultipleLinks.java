package com.bd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleLinks extends BaseDriver {

    public String url = "https://testguild.com/";

    @Test
    public void linkTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // WebElement element = driver.findElement(By.xpath(""));

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        //WebElement elements = driver.findElements(By.xpath(""));

    }
}