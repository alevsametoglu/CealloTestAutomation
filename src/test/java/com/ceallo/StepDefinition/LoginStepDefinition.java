package com.ceallo.StepDefinition;

import com.ceallo.Pages.LoginPage;
import com.ceallo.Utilities.ConfigurationReader;
import com.ceallo.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
    LoginPage loginpage = new LoginPage();

    @Given("user is on the Login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));

        loginpage.userName.sendKeys(ConfigurationReader.getProperty("loginUsername"));
        loginpage.password.sendKeys(ConfigurationReader.getProperty("loginPw"));
        loginpage.loginButton.click();


    }

    @When("user enter  username {string}")
    public void user_enter_username(String string) {

    }

    @When("user enters Password {string}")
    public void user_enters_password(String string) {

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }
}
