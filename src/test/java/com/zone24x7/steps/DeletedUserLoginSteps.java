package com.zone24x7.steps;

import com.zone24x7.pages.LoggingPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DeletedUserLoginSteps {

    LoggingPage loggingPage;
    WebDriver driver;

    @When("User enters username for deleted user")
    public void user_enters_username_for_deleted_user() {

        driver= DriverFactory.getDriver();
        driver.get("https://zwmap-wms-qa.sandbox.zone24x7.lk/");
        loggingPage = new LoggingPage(driver);
        loggingPage.enterUserName("deletenb@wms.app");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User enters password for deleted user")
    public void user_enters_password_for_deleted_user() {

        loggingPage.enterPassword("1qaz2wsx@A");

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on Login for deleted user")
    public void user_clicks_on_login_for_deleted_user() {

        loggingPage.ClickLogin();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("A Deletion message {string} should be displayed")
    public void a_deletion_message_should_be_displayed(String string) {

        Assert.assertEquals(loggingPage.verifyDeleteLogin(),"Invalid username or password.");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }


}
