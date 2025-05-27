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
    private By btncreate =By.xpath("/html/body/div[4]/div[3]/div[3]/div/button[2]");
    private By drpdwnSecoondaryWH = By.xpath("//div[@id='optionalWarehouses']");
    private By drpdwnValueSecondaryWH =By.xpath("//*[@id=\"mui-20\"]/li");
    private By closeSecondaryWH = By.xpath("/html/body/div[4]/div[3]/div[2]/div[2]/div/div[1]");
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

    public AddUserPage ClickSecondaryWH(){

        click(drpdwnSecoondaryWH);
        return this;

    }

    public AddUserPage SelectValueSecondaryWH(){

        click(drpdwnValueSecondaryWH);
        return this;}

    public AddUserPage ReClickSecondaryWH(){

        click(closeSecondaryWH);
        return this;

    }

    public DashbroadPage Clickcreatebtn(){

        click(btncreate);
        return new DashbroadPage(driver);
    }

    public AddUserPage addDefaultWH(String WHName){

        enterText(drpdwnDefWH,WHName);
        return this;
    }


}


