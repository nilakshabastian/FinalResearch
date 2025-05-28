package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggingPage extends BasePage {


    protected WebDriver driver;
    private By txtUserName =By.xpath("//input[@id='username']");
    private By txtPassword =By.xpath("//input[@id='password']");
    private By btnLogin =By.xpath("//button[@id='kc-login']");
    private By lblSuspendMesseage = By.xpath("//div[contains(text(),'Account is disabled, contact your administrator.')]");
    private By lblDeleteMesseage = By.xpath("//div[contains(text(),'Invalid username or password.')]");


    public LoggingPage(WebDriver driver){
        super(driver);
    }

    public LoggingPage enterUserName(String userName){
        enterText(txtUserName,userName);
        return this;
    }
    public LoggingPage enterPassword(String password){
        enterText(txtPassword,password);
        return this;
    }

    public DashbroadPage ClickLogin() throws InterruptedException {

        Thread.sleep(3000);
        click(btnLogin);
        return new DashbroadPage(driver);
    }

    public String verifySuspendLogin(){

        return getText(lblSuspendMesseage);
    }

    public String verifyDeleteLogin(){

        return getText(lblDeleteMesseage);
    }
}
