package com.thetestingacademy.ex07_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Selenium27_Relative_Locators_P3 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://codepen.io/AbdullahSajjad/full/LYGVRgK";
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();


        // iframe
        driver.switchTo().frame("result");

        WebElement submit = driver.findElement(By.xpath("//form[@id=\"form\"]/button"));
        submit.click();

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));


        String errorText = error_element.getText();
        Assert.assertTrue(error_element.isDisplayed());
        Assert.assertEquals(errorText,"Username must be at least 3 characters");








        Thread.sleep(3000);
        driver.quit();


    }
}
