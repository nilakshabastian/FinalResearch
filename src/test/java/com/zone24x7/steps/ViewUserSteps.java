package com.zone24x7.steps;

import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.pages.LoggingPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ViewUserSteps {

    LoggingPage loggingPage;
    WebDriver driver;
    DashbroadPage dashbroadPage;

    @Given("I navigate to The WHS Login page")
    public void i_navigate_to_the_whs_login_page() throws InterruptedException {

        driver= DriverFactory.getDriver();
        driver.get("https://zwmap-wms-qa.sandbox.zone24x7.lk/");
        loggingPage = new LoggingPage(driver);
        loggingPage.enterUserName("nilakshab@wms.app");
        loggingPage.enterPassword("Abcd#456");
        loggingPage.ClickLogin();

        //Thread.sleep(5000);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("I navigate to View User Management page")
    public void i_navigate_to_view_user_management_page() throws InterruptedException {
        dashbroadPage = new DashbroadPage(driver);

        dashbroadPage.seachUsername("nilakshab@wms.app"+ Keys.ENTER);


    }

    @Then("Verify the User View")
    public void verify_the_user_view() throws InterruptedException {
        dashbroadPage = new DashbroadPage(driver);
        dashbroadPage.clickViewbtn();
        Assert.assertEquals(dashbroadPage.vryViewUserName(), "nilakshab@wms.app");
        dashbroadPage.clickCloseViewUserDetails();

    }

    @Then("Logout From WHM")
    public void logout_from_whm() {

        dashbroadPage = new DashbroadPage(driver);
        dashbroadPage.logoutUsermanagement();


    }


}
