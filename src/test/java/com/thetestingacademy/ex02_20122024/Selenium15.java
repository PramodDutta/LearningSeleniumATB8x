package com.thetestingacademy.ex02_20122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class Selenium15 {
    @Test
    public void testMethod01() throws Exception {

        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the Cura heatlh care Service is visible in the page source.


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");


        // Alternate way to maximize
        //driver.manage().window().maximize();

        // TestNG Assertion
        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");

        // AssertJ Assertion
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");


        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            Assert.assertTrue(true);
        } else {
            throw new Exception("Heading Not Found!!");
        }


        // "" - Empty , " " - blank

        driver.quit();


    }
}
