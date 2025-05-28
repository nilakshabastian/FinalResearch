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
    private By lblStatus =By.xpath("//span[contains(text(),'Inactive')]");
    private By btnView =By.xpath("//button[@aria-label='View']");
    private By lblViewUserName = By.xpath("//h6[contains(text(),'nilakshab@wms.app')]");
    private By lblCreateUserName =By.xpath("//h6[contains(text(),'aaaa@wms.app')]");
    private By btnDelete= By.xpath("//button[@aria-label='Delete']");
    private By btnYesDelete= By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[2]/button");
    private By btnEdit= By.xpath("//*[@id=\"root\"]/div/div/main/div/main/div[2]/div/div[2]/div[1]/table/tbody/tr/td[4]/button[3]");
    private By lblEditusername =By.xpath("//td[contains(text(),'Nilaksha1 Bastian1')]");
    private By lblUserManagementicon =By.xpath("//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-5414pq']");
    private By btnCloseViewUserDetails =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-x7lr3e']");
    private By btnLogout =By.xpath("//div[@class='MuiBox-root css-3jv294']");


    public DashbroadPage(WebDriver driver){
        super(driver);
    }

    public DashbroadPage checkTemplateManagementText (){
        isDisplayed(lblUserManagement);
        return this;
    }

    public DashbroadPage seachUsername(String uName) throws InterruptedException {

        Thread.sleep(3000);
        enterText(txtSearch,uName);
        return this;

    }

    public DashbroadPage enterUsername(){

        click(txtSearch);
        return this;
    }

    public DashbroadPage suspendUser() throws InterruptedException {
        Thread.sleep(5000);
        click(btnSuspend);
        return this;
    }

    public DashbroadPage confirmSuspend(){

        click(btnYesSuspend);
        return this;

    }

    public String vryStatus() throws InterruptedException {
        Thread.sleep(3000);
        return getText(lblStatus);
    }

   public DashbroadPage clickViewbtn() throws InterruptedException {
       Thread.sleep(3000);
        click(btnView);
        return this;
   }

    public String vryViewUserName(){

        return getText(lblViewUserName);


    }

    public String vryCreatedUserName(){

        return getText(lblCreateUserName);


    }

    public AddUserPage ClickAddUserBtn() throws InterruptedException {

        Thread.sleep(5000);
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

    public String vryEditUserStatus(){

        return getText(lblEditusername);
    }

    public DashbroadPage ClickUsermanagementIcon(){

        click(lblUserManagementicon);
        return this;
    }

    public DashbroadPage clickCloseViewUserDetails(){

        click(btnCloseViewUserDetails);
        return this;

    }

    public DashbroadPage logoutUsermanagement(){

        click(btnLogout);
        return this;
    }





}
