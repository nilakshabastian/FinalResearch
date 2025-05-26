package com.zone24x7.steps;

import com.zone24x7.pages.LoggingPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SuspendUserLoginSteps {

    LoggingPage loggingPage;
    WebDriver driver;

    @When("User enters username {string}")
    public void user_enters_username(String string) {

        driver= DriverFactory.getDriver();
        driver.get("https://zwmap-wms-qa.sandbox.zone24x7.lk/");
        loggingPage = new LoggingPage(driver);
        loggingPage.enterUserName("suspendnb@wms.app");


        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters password {string}")
    public void user_enters_password(String string) {


        loggingPage.enterPassword("1qaz2wsx@A");

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on Login")
    public void user_clicks_on_login() {

        loggingPage.ClickLogin();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("A suspension message {string} should be displayed")
    public void a_suspension_message_should_be_displayed(String string) {

        Assert.assertEquals(loggingPage.verifySuspendLogin(),"Account is disabled, contact your administrator.");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
