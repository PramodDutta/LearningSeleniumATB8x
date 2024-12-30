package com.thetestingacademy.ex03_23122024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium16 {
    @Test
    public void testMethod01() throws Exception {

        // Open the https://katalon-demo-cura.herokuapp.com/
        // Verify the title and search a string in pageSource
        // Add assertion that the Cura heatlh care Service is visible in the page source.


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // HTML element -> Web Element - Selenium
        // Web Element  Find - Interact with It

        // How to find the elements
        // Selenium
        // Selenium
        // Basic -> ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath







        driver.quit();


    }
}
