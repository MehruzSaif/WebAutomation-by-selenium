package com.bd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {

    // Before Suite

    @BeforeSuite
    public void beforeSuiteExample() {
        System.out.println("Before Suite Example");
    }

    @Test
    (priority = 1)
    public void test1() {
        System.out.println("Test..........1");
    }

    @Test
    (priority = 0)
    public void test2() {
        System.out.println("Test..........2");
    }

    @BeforeTest
    public void beforeTestExample() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTestExample() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuiteExample() {
        System.out.println("After Suite Example");
    }

    @BeforeClass
    public void beforeClassExample() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassExample() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethodExample() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethodExample() {
        System.out.println("After Method");
    }
}