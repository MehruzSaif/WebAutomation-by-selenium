package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownExample extends BaseDriver {

    public String url = "https://qavbox.github.io/demo/signup/";
    
    @Test
    public void dropdownTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));

        Select select = new Select(gender);

        // using visible Text
        select.selectByVisibleText("Male");
        Thread.sleep(5000);

        // using value
        select.selectByValue("female");
        Thread.sleep(5000);

        select.selectByIndex(3);
        System.out.println(url);
        Thread.sleep(3000);

        WebElement checkBox2 = driver.findElement(By.xpath("//input[@value='automationtesting']"));
        checkBox2.click();
        Thread.sleep(3000);
    }
}