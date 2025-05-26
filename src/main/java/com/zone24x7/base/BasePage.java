package com.zone24x7.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

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


    public String getText(By by){
        WebElement webElement = waitForElementToBeVisible(by);
        return webElement.getText();
    }

    public BasePage selectByVisibleText(By by, String text){
        WebElement webElement = waitForElementToBeVisible(by);
        Select select = new Select(webElement);
        select.selectByVisibleText(text);
        return this;
    }

}
