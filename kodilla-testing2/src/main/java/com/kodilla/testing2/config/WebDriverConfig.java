package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverConfig {
    public final static String EDGE = "EDGE_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";
    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.msedge.driver", "c:\\Selenium-drivers\\Edge\\msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver", "c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

        if (driver.equals(EDGE)) {
            return new EdgeDriver();
        } else if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }
}