package com.zone24x7.steps;

import com.zone24x7.base.BasePage;
import com.zone24x7.pages.DashbroadPage;
import com.zone24x7.pages.EditUserPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditUserSteps {

    WebDriver driver;
    DashbroadPage dashbroadPage;
    EditUserPage editUserPage;

    @When("I navigate to View User Management page for Edit")
    public void i_navigate_to_view_user_management_page_for_edit() throws InterruptedException {

        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);
        Thread.sleep(5000);
        dashbroadPage.seachUsername("nilakshab5@wms.app"+ Keys.ENTER);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("Edit the selected user")
    public void edit_the_selected_user() throws InterruptedException {
        driver= DriverFactory.getDriver();
        dashbroadPage = new DashbroadPage(driver);
        dashbroadPage.ClickEditUserBtn();
        editUserPage =new EditUserPage(driver);
        editUserPage.clearFileds(driver);
        editUserPage.EditFirstName("Nilaksha4");
        editUserPage.EditLastName("Bastian4");
        editUserPage.ClickUpdatebtn();
        Assert.assertEquals(BasePage.WorkingMemory.getMemorizedValue("insertValueData1")+" "+BasePage.WorkingMemory.getMemorizedValue("insertValueData2"), dashbroadPage.vryEditUserStatus());
        dashbroadPage.logoutUsermanagement();
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
