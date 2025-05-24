package com.zone24x7.base;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {

    protected WebDriver driver;
    public FluentWait<WebDriver> wait;


    public BasePage(WebDriver Driver) {

        this.driver = Driver;
        this.wait = new FluentWait<>(Driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

    public BasePage() {
    }


    public WebElement waitForElementToBeVisible(By locator) {
        return this.wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }

    public BasePage enterText(By by, String text) {

        WebElement webElement = waitForElementToBeVisible(by);
        webElement.sendKeys(text);
        return this;

    }

    public BasePage click(By by){
        WebElement webElement = waitForElementToBeClickable(by);
        webElement.click();
        return this;
    }

    public boolean isDisplayed(By by){
        WebElement webElement = waitForElementToBeVisible(by);
        return webElement.isDisplayed();
    }

}
