package com.thetestingacademy.ex02_20122024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium13 {
    @Test
    public void testMethod01() throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        // No back, forward allowed in case of get


        //navigate.to, forward, back

        driver.navigate().to("https://thetestingacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println(driver.getTitle());








    }
}
