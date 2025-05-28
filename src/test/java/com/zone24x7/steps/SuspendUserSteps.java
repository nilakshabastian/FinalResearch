package com.zone24x7.steps;

import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SuspendUserSteps {

    WebDriver driver;
    DashbroadPage dashbroadPage;
    String actualStatus;

    @When("I navigate to View User Management page for suspend")
    public void i_navigate_to_view_user_management_page_for_suspend() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);
        Thread.sleep(5000);
        dashbroadPage.seachUsername("nilakshab2@wms.app"+ Keys.ENTER);

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("Suspend the selected user")
    public void suspend_the_selected_user() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);

        dashbroadPage.suspendUser();
        dashbroadPage.confirmSuspend();
        Assert.assertEquals(dashbroadPage.vryStatus(), "Inactive");


        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
