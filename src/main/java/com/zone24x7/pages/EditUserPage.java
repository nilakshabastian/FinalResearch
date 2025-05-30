package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditUserPage extends BasePage {

    protected WebDriver driver;
    private By txtEditFName =By.id("firstName");
    private By txtEditLName =By.id("lastName");
    private By btnUpdate =By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-8v3hxn']");



    public EditUserPage(WebDriver driver){
        super(driver);
    }
    public EditUserPage clearFileds(WebDriver driver) throws InterruptedException {

        Thread.sleep(5000);
        WebElement elementFName= driver.findElement(txtEditFName);
        WebElement elementLName= driver.findElement(txtEditLName);
        click(txtEditFName);
        click(txtEditLName);
        elementFName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        elementFName.sendKeys(Keys.DELETE);
        elementLName.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        elementLName.sendKeys(Keys.DELETE);
        return this;
    }

    public EditUserPage EditFirstName(String fName) throws InterruptedException {
        Thread.sleep(3000);
        clear(txtEditFName);
        enterText(txtEditFName,fName);
        WorkingMemory.setValueToMemory("insertValueData1",fName);
        return this;
    }

    public EditUserPage EditLastName(String lName) throws InterruptedException {
        Thread.sleep(3000);
        clear(txtEditLName);
        enterText(txtEditLName,lName);
        WorkingMemory.setValueToMemory("insertValueData2",lName);
        return this;
    }

    public DashbroadPage ClickUpdatebtn(){

        click(btnUpdate);
        return new DashbroadPage(driver);
    }
}
