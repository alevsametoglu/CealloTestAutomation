package com.ceallo.Pages;

import com.ceallo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[id='user']")
    public WebElement userName;

    @FindBy(css = "input[id='password']")
    public WebElement password;

    @FindBy(css = "input[id='submit-form']")
    public WebElement loginButton;

}
