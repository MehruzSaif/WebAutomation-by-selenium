package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardHandlying extends BaseDriver {

    public String url ="https://demoqa.com/text-box";

    @Test
    public void keyboardTest() throws InterruptedException {
        driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement presentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

        presentAddress.sendKeys("Uttar Badda, Dhaka - 1212, Bangladesh");

        //Select All
        action.keyDown(Keys.CONTROL);
        action.sendKeys("a");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        //Copy
        action.keyDown(Keys.CONTROL);
        action.sendKeys("c");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        //Tab for next Textarea
        action.sendKeys(Keys.TAB);
        action.build().perform();

        //Paste
        action.keyDown(Keys.CONTROL);
        action.sendKeys("v");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        Thread.sleep(3000);

        //Enter
        action.sendKeys(Keys.ENTER);
        action.build().perform();

    }
}