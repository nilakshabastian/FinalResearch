package com.zone24x7.steps;

import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DeleteUserSteps {

    WebDriver driver;
    DashbroadPage dashbroadPage;



    @When("I navigate to View User Management page for Delete")
    public void i_navigate_to_view_user_management_page_for_delete() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);
        Thread.sleep(5000);
        dashbroadPage.seachUsername("nilakshab4@wms.app"+ Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("Delete the selected user")
    public void delete_the_selected_user() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);
        dashbroadPage.ClickDelete();
        dashbroadPage.confirmDelete();
        dashbroadPage.logoutUsermanagement();

        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
