package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VisibilityExample extends BaseDriver {

    public String url = "https://the-internet.herokuapp.com/javascript_alerts";

    @Test
    public void alertTest() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement jsAlert = driver.findElement(By.xpath("//abutton[contains(text(),'Click for JS Alert')]"));
        WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
        WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));

        try {
            if(jsAlert.isDisplayed()) {

                /* For JS Alert */
                jsAlert.click();
                Thread.sleep(2000);
                driver.switchTo().alert().accept();
    
                String expectedAlert = "You successfully clicked an alert";
                String actualAlert = driver.getTitle();
                SoftAssert soft1 = new SoftAssert();
                soft1.assertEquals(actualAlert, expectedAlert);
    
                Thread.sleep(3000);
                
            }
        } catch (Exception e) {
            // Todo: will write custom code for report which contains this error message.
        }

        /* For JS Confirm */
        jsConfirm.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

        /* For JS Prompt Result */
        jsPrompt.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("You entered: Automation Testing");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

}