package com.zone24x7.steps;

import com.zone24x7.pages.DashbroadPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SuspendUser {

    WebDriver driver;
    DashbroadPage dashbroadPage;

    @When("Suspend the selected user")
    public void suspend_the_selected_user() throws InterruptedException {


        dashbroadPage = new DashbroadPage(driver);
        Thread.sleep(5000);
        dashbroadPage.suspendUser();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
