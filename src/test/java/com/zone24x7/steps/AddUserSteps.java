package com.zone24x7.steps;

import com.zone24x7.pages.AddUserPage;
import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.pages.LoggingPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AddUserSteps {

    WebDriver driver;
    DashbroadPage dashbroadPage;
    AddUserPage addUserPage;
    LoggingPage loggingPage;



    @When("I navigate to Add User page")
    public void i_navigate_to_add_user_page() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);

        dashbroadPage.ClickAddUserBtn();
        Thread.sleep(5000);


        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

    @When("the admin adds a new user with valid details")
    public void the_admin_adds_a_new_user_with_valid_details() throws InterruptedException {

        addUserPage = new AddUserPage(driver);
        addUserPage.enterNewUserName("nilakshab9");
        addUserPage.AddFirstName("Nilaksha");
        addUserPage.AddLastName("Bastian");
        addUserPage.AddPassword("1qaz2wsx@A");
        addUserPage.AddRePassword("1qaz2wsx@A");
        Thread.sleep(5000);
        addUserPage.ClickStatus();
        addUserPage.SelectActiveStatus();
        Thread.sleep(5000);
        addUserPage.addDefaultWH("USA");
        //addUserPage.ClickSecondaryWH();
        //addUserPage.SelectValueSecondaryWH();
        //addUserPage.ReClickSecondaryWH();
        addUserPage.SelectUserRole();
        addUserPage.Clickcreatebtn();


        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Given("I navigate to The WHS Login page via SuperAdmin")
    public void i_navigate_to_the_whs_login_page_via_super_admin() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
