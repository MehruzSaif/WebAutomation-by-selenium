package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollHandling extends BaseDriver {

    public String url = "https://testguild.com/";
    
    @Test
    public void scrollTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement target = driver.findElement(By.xpath("//span[@id='Nodejs_Desktop_Automation_Testing_Framework_Simon_Hofmann']"));
        
        Actions action = new Actions(driver);

        //For scrolling
        action.moveToElement(target).perform();
        Thread.sleep(3000);
    }
}