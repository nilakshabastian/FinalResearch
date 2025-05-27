package com.zone24x7.steps;

import com.zone24x7.pages.AddUserPage;
import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.pages.LoggingPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddNewUserUsingSuperAdminSteps {

    LoggingPage loggingPage;
    WebDriver driver;
    DashbroadPage dashbroadPage;
    AddUserPage addUserPage;

    @When("User enters username for Super Admin")
    public void user_enters_username_for_super_admin() {

        driver= DriverFactory.getDriver();
        driver.get("https://zwmap-wms-qa.sandbox.zone24x7.lk/");
        loggingPage = new LoggingPage(driver);
        loggingPage.enterUserName("wmssupreadmin@gmail.com");

    }
    @When("User enters password for Super Admin")
    public void user_enters_password_for_super_admin() {

        loggingPage.enterPassword("Abcd@#1234");

    }
    @When("User clicks on Login as Super Admin")
    public void user_clicks_on_login_as_super_admin() throws InterruptedException {

        loggingPage.ClickLogin();
        Thread.sleep(5000);
    }

    @When("User select the User Management page")
    public void user_select_the_user_management_page() {

        driver= DriverFactory.getDriver();
        dashbroadPage =new DashbroadPage(driver);
        dashbroadPage.ClickUsermanagementIcon();
    }

    @When("Enter UserName to AddUser page")
    public void enter_user_name_to_add_user_page() {
        addUserPage =new AddUserPage(driver);
        addUserPage.enterNewUserName("aaaa");

    }

    @When("Enter EmployeeFName to AddUser page")
    public void enter_employee_f_name_to_add_user_page() {

        addUserPage.AddFirstName("Nilakshad");

    }

    @When("Enter EmployeeLName to AddUser page")
    public void enter_employee_l_name_to_add_user_page() {

        addUserPage.AddLastName("BastianL");

    }

    @When("Enter Password to AddUser page")
    public void enter_password_to_add_user_page() {

        addUserPage.AddPassword("1qaz2wsx@A");

    }

    @When("Enter REPassword to AddUser page")
    public void enter_re_password_to_add_user_page() {

        addUserPage.AddRePassword("1qaz2wsx@A");

    }

    @When("Select the Status AddUser page")
    public void select_the_status_add_user_page() throws InterruptedException {

        addUserPage.ClickStatus();
        addUserPage.SelectActiveStatus();

    }

    @When("Click the Create button AddUser page")
    public void click_the_create_button_add_user_page() {

        addUserPage.Clickcreatebtn();

    }

    @Then("Verify the Successfully Message")
    public void verify_the_successfully_message() {

        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }


}
