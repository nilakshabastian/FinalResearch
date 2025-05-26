package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbroadPage extends BasePage {

    protected WebDriver driver;
    private By lblUserManagement =By.xpath("//button[@class = \"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1wb7qr7\"]");
    private By btnAddNewUser =By.xpath("//button[@class = \"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1wb7qr7\"]");
    private By txtSearch =By.xpath("//input[@id='search']");
    private By btnSuspend =By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[4]/button[2]");;
    private By btnYesSuspend =By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[2]/button");
    private By lblStatus =By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[3]/div/span");
    private By btnView =By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[4]/button[4]");
    private By lblViewUserName = By.xpath("//h6[contains(text(),'nilakshab@wms.app')]");
    private By btnDelete= By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[4]/button[1]");
    private By btnYesDelete= By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[2]/button");
    private By btnEdit= By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[4]/button[3]");




    public DashbroadPage(WebDriver driver){
        super(driver);
    }

    public DashbroadPage checkTemplateManagementText (){
        isDisplayed(lblUserManagement);
        return this;
    }

    public DashbroadPage seachUsername(String uName){
        enterText(txtSearch,uName);
        return this;

    }

    public DashbroadPage enterUsername(){

        click(txtSearch);
        return this;
    }

    public DashbroadPage suspendUser(){

        click(btnSuspend);
        return this;
    }

    public DashbroadPage confirmSuspend(){

        click(btnYesSuspend);
        return this;

    }

    public DashbroadPage vryStatus(){

        getText(lblStatus);
        return this;

    }

   public DashbroadPage clickViewbtn(){

        click(btnView);
        return this;
   }

    public DashbroadPage vryViewUserName(){

        getText(lblViewUserName);
        return this;

    }

    public AddUserPage ClickAddUserBtn() {
        click(btnAddNewUser);
        return new AddUserPage(driver);
    }

    public DashbroadPage ClickDelete(){

        click(btnDelete);
        return this;
    }

    public DashbroadPage confirmDelete(){

        click(btnYesDelete);
        return this;

    }

    public EditUserPage ClickEditUserBtn() {
        click(btnEdit);
        return new EditUserPage(driver);
    }



}
