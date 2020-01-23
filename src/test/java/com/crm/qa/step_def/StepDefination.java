package com.crm.qa.step_def;

import com.crm.qa.pageObjects.HomePage;
import com.crm.qa.pageObjects.LoginPage;
import cucumber.api.java.en.*;

public class StepDefination {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        loginPage.login_page_url();
        }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        loginPage.validateLogin();
        }

    @When("^he clicks on login button$")
    public void he_clicks_on_login_button() throws Throwable {
        loginPage.clickLoginbtn();
        }

    @Then("^he should be on homepage$")
    public void he_should_be_on_homepage() throws Throwable {
        homePage.homepagevalidation();
    }

    @Then("^customer clikes on setting icon$")
    public void customer_clikes_on_setting_icon() throws Throwable {
        homePage.validate_setting_icon();
        }

    @Then("^customer clicked on logout button$")
    public void customer_clicked_on_logout_button() throws Throwable {
        homePage.validate_logout();
        }


}
