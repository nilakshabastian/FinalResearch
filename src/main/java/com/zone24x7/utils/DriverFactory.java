package com.zone24x7.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                case "firefox" :
                    WebDriverManager.chromedriver().setup();

                    driver = new ChromeDriver();
                    driver.manage().window().maximize();

            }
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
