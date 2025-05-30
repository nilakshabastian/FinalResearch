package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashbroadPage extends BasePage {

    protected WebDriver driver;
    private By lblUserManagement =By.xpath("//button[@class = \"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1wb7qr7\"]");
    private By btnAddNewUser =By.xpath("//button[@class = \"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1wb7qr7\"]");
    private By txtSearch =By.xpath("//input[@id='search']");
    private By btnSuspend =By.xpath("//button[@aria-label='Deactivate']");;
    private By btnYesSuspend =By.xpath("//button[normalize-space()='Yes']");
    private By lblStatus =By.xpath("//span[contains(text(),'Inactive')]");
    private By btnView =By.xpath("//button[@aria-label='View']");
    private By lblViewUserName = By.xpath("//h6[contains(text(),'nilakshab@wms.app')]");
    private By lblCreateUserName =By.xpath("//h6[contains(text(),'aaaa@wms.app')]");
    private By btnDelete= By.xpath("//button[@aria-label='Delete']");
    private By btnYesDelete= By.xpath("//button[normalize-space()='Yes']");
    private By btnEdit= By.xpath("//button[@aria-label='Edit']");
    private By lblEditusername =By.xpath("(//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-sizeSmall css-13dlznl'])[1]");
    private By lblUserManagementicon =By.xpath("//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-5414pq']");
    private By btnCloseViewUserDetails =By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-x7lr3e']");
    private By btnLogout =By.xpath("//div[@class='MuiBox-root css-3jv294']");
    private By txtUserCreationTosMeg = By.xpath("//div[@class='MuiAlert-message css-1xsto0d']");

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
        Thread.sleep(3000);
        click(btnSuspend);
        return this;
    }

    public DashbroadPage confirmSuspend() throws InterruptedException {
        Thread.sleep(3000);
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

        Thread.sleep(2000);
        click(btnAddNewUser);
        return new AddUserPage(driver);
    }

    public DashbroadPage ClickDelete() throws InterruptedException {
        Thread.sleep(2000);
        click(btnDelete);
        return this;
    }

    public DashbroadPage confirmDelete() throws InterruptedException {
        Thread.sleep(2000);
        click(btnYesDelete);
        return this;

    }

    public EditUserPage ClickEditUserBtn() throws InterruptedException {
        Thread.sleep(3000);
        click(btnEdit);
        return new EditUserPage(driver);
    }

    public String vryEditUserStatus() throws InterruptedException {
        Thread.sleep(5000);
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

    public String vryGetTostMsg() throws InterruptedException {

        Thread.sleep(1000);
        return getText(txtUserCreationTosMeg);
    }





}
