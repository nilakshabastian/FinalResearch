package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {

    protected WebDriver driver;
    private By txtAddUserName =By.xpath("//input[@id=\"username\"]");
    private By txtFirstName =By.xpath("//input[@id=\"firstName\"]");
    private By txtLastName =By.xpath("//input[@id=\"lastName\"]");
    private By txtPassword =By.xpath("//input[@id=\"password\"]");
    private By txtREPassword =By.xpath("//input[@id=\"passwordCom\"]");
    private By dropdownStatus =By.xpath("//div[@id='status'] ");
    // private By dropValueStatus =By.xpath("//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-17xrhff']");
    private By dropValueStatus =By.xpath("//li[@data-value=\"ACTIVE\"]");
    private By checkboxUserRole =By.xpath("//span[contains(text(),'Warehouse Admin')]");
    private By btncreate =By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-8v3hxn']");
    private By drpdwnDefWH = By.id("defaultWarehouse");



    public AddUserPage(WebDriver driver){
        super(driver);
    }

    public AddUserPage enterNewUserName(String userName){
        enterText(txtAddUserName,userName);
        return this;
    }

    public AddUserPage AddFirstName(String fName){

        enterText(txtFirstName,fName);
        return this;
    }

    public AddUserPage AddLastName(String lName){

        enterText(txtLastName,lName);
        return this;
    }

    public AddUserPage AddPassword(String passWord){

        enterText(txtPassword,passWord);
        return this;
    }

    public AddUserPage AddRePassword(String rePassWord){

        enterText(txtREPassword,rePassWord);
        return this;
    }

    public AddUserPage SelectStatus(){

        click(dropdownStatus);
        return this;
    }

    public AddUserPage SelectUserRole(){

        click(checkboxUserRole);
        return this;
    }

    public AddUserPage ClickStatus(){

        click(dropdownStatus);
        return this;

    }

    public AddUserPage SelectActiveStatus() throws InterruptedException {

        Thread.sleep(5000);
        click(dropValueStatus);
        return this;}



    public DashbroadPage Clickcreatebtn() throws InterruptedException {
        Thread.sleep(3000);
        click(btncreate);
        return new DashbroadPage(driver);
    }

    public AddUserPage addDefaultWH(String WHName){

        enterText(drpdwnDefWH,WHName);
        return this;
    }


}


