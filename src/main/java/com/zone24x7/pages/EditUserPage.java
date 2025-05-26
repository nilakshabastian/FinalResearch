package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditUserPage extends BasePage {

    protected WebDriver driver;
    private By txtEditFName =By.xpath("//input[@id='firstName']");
    private By txtEditLName =By.xpath("//input[@id='lastName']");
    private By btnUpdate =By.xpath("/html/body/div[4]/div[3]/div[3]/div/button[2]");



    public EditUserPage(WebDriver driver){

        super(driver);
    }

    public EditUserPage EditFirstName(String fName){

        enterText(txtEditFName,fName);
        return this;
    }

    public EditUserPage EditLastName(String lName){

        enterText(txtEditLName,lName);
        return this;
    }

    public DashbroadPage ClickUpdatebtn(){

        click(btnUpdate);
        return new DashbroadPage(driver);
    }
}
