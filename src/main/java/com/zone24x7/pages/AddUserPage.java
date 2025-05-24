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
    private By dropdownStatus =By.xpath("//li[@tabindex='0']");
    private By checkboxUserRole =By.xpath("//input[@value='24cae04f-0ba3-4ae8-8d9d-83fd75771f5e']");
    private By btncreate =By.xpath("/html/body/div[4]/div[3]/div[3]/div/button[2]");

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

    public DashbroadPage Clickcreatebtn(){

        click(btncreate);
        return new DashbroadPage(driver);
    }


}


