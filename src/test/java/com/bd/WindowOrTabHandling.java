package com.bd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class WindowOrTabHandling extends BaseDriver {

    public String url1 = "https://the-internet.herokuapp.com/javascript_alerts";
    public String url2 = "https://testguild.com/";
    
    @Test
    public void tabWindowTest() throws InterruptedException {
        driver.get(url1);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        /* //for new Tab
        driver.switchTo().newWindow(WindowType.TAB); */

        //for new Window
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get(url2);
        windowHandling();

        //For switching tab or window
        driver.switchTo().window(windowHandling().get(0));
        Thread.sleep(3000);

        driver.switchTo().window(windowHandling().get(1));
        Thread.sleep(2000);
    }

    /* 
     * We have to switch several Tabs and when should we travel specif Tab ->
     * 1st we get the total tabs of the browser.
     * Then we travel the specific tab.
     */

    public List<String> windowHandling() {
        Set<String> windowHandles = driver.getWindowHandles();
        ArrayList<String> windowHandlesList = new ArrayList<String>(windowHandles);
        int size = windowHandlesList.size();
        System.out.println("Window/Tab numbers:" + " " + size);

        return windowHandlesList;
    }
}