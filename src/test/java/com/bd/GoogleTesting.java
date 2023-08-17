package com.bd;

import org.testng.annotations.Test;

public class GoogleTesting extends BaseDriver {

    public String baseUrl = "https://www.google.com/";

    @Test
    public void googleTest() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().window().maximize();

        if (driver.getTitle().contains("Google")) {
            System.out.println(driver.getTitle());
        } else {
            System.out.println("Title didn't match");
        }

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(5000);
    }
}