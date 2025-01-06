package com.thetestingacademy.ex07_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Selenium26_Relative_Locators {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://www.aqi.in/real-time-most-polluted-city-ranking";
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();


        List<WebElement> searchBox = driver.findElements(By.xpath("//input[@type=\"search\"]"));
        searchBox.get(1).sendKeys("India" + Keys.ENTER);


        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement e : locations) {

            String s1 = driver.findElement(with(By.tagName("p")).toLeftOf(e)).getText();
            String s2 = driver.findElement(with(By.tagName("span")).toRightOf(e)).getText();
            String s3 = driver.findElement(with(By.tagName("p")).above(e)).getText();
            String s4 = driver.findElement(with(By.tagName("p")).below(e)).getText();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println("| +" + s1 +" | " + e.getText() + " | " + s2 + " | ");


        }


        Thread.sleep(3000);
        driver.quit();


    }
}
