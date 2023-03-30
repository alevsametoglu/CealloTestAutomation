package com.ceallo.Pages;

import com.ceallo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "ul[id='appmenu'] li[data-id='contacts']")

    public WebElement contactPageButton;
}
