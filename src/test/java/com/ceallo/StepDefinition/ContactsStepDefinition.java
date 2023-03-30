package com.ceallo.StepDefinition;

import com.ceallo.Pages.ContactsPage;
import com.ceallo.Pages.HomePage;
import com.ceallo.Pages.LoginPage;
import com.ceallo.Utilities.BrowserUtils;
import com.ceallo.Utilities.ConfigurationReader;
import com.ceallo.Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactsStepDefinition {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();


    ContactsPage contactPage = new ContactsPage();
    Faker javaFaker = new Faker();
    String contactName = javaFaker.name().fullName();


    @Given("The user is on the contact page")
    public void the_user_is_on_the_contact_page() {
        loginPage.login();
        homePage.contactPageButton.click();

        BrowserUtils.wait(10);

//

//


    }

    @When("when user click on new contact button")
    public void when_user_click_on_new_contact_button() throws InterruptedException {
        contactPage.newContactButton.click();


    }

    @When("The user enter user name")
    public void the_user_enter_user_name() {
        contactPage.fullNameInput.clear();
        contactPage.fullNameInput.sendKeys(contactName, Keys.ENTER);

    }

    @Then("The user should see his name on the list of contacts")
    public void the_user_should_see_his_name_on_the_list_of_contacts() {

        List<WebElement> contacts = contactPage.contactList;

        for (WebElement contact : contacts) {

            if (contact.equals(contactName)) {

                Assert.assertEquals(contact.getText(), contactName);

            }
        }


    }


    @Then("The user should see all the contacts and number of contacts")
    public void the_user_should_see_all_the_contacts_and_number_of_contacts() {
        BrowserUtils.wait(10);

        String ExpectedContactCount = contactPage.contactsCount.getText();

        List<WebElement> contacts = contactPage.contactList;

        int actualContactCount = contacts.size();

        int expectedCount = Integer.valueOf(ExpectedContactCount);


        Assert.assertEquals(actualContactCount, expectedCount);

    }


    @When("The user click one of the concat name")
    public void the_user_click_one_of_the_concat_name() {
        List<WebElement> contacts = contactPage.contactList;
        WebElement contact = contacts.get(3);
        System.out.println(contact.getText());
        contact.click();
        BrowserUtils.wait(20);


    }

    @When("The user click on  the little gray button of on the profile picture")
    public void the_user_click_on_the_little_gray_button_of_on_the_profile_picture() {
        contactPage.changeProfilePictureButton.click();
        BrowserUtils.wait(5);


    }

    @When("The user click on  Choose from file folder")
    public void the_user_click_on_choose_from_file_folder() {
        contactPage.chooseFromFileButton.click();
        BrowserUtils.wait(5);

    }

    @When("The user click one of the picture")
    public void the_user_click_one_of_the_picture() {
        contactPage.profilePicture.click();
        BrowserUtils.wait(7);

    }

    @When("The  user click on  Choose button")
    public void the_user_click_on_choose_button() {
        contactPage.chooseButton.click();
        BrowserUtils.wait(10);


    }

    @Then("The  user should see the picture on  his profile")
    public void the_user_should_see_the_picture_on_his_profile() {


    }


    @When("The user click on three dot on the top right  of the page")
    public void the_user_click_on_three_dot_on_the_top_right_of_the_page() {
        contactPage.threeDotButton.click();
        BrowserUtils.wait(10);
    }

    @When("The user click on delete button")
    public void the_user_click_on_delete_button() {
        contactPage.deleteButton.click();
        BrowserUtils.wait(10);

    }

    @Then("The user should not see the contact on the list")
    public void the_user_should_not_see_the_contact_on_the_list() {
        Assert.assertTrue(contactPage.noContactSelected.isDisplayed());



    }
}
