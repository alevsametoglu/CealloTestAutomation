package com.ceallo.Pages;

import com.ceallo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactsPage {
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class=\"app-navigation-new\"]/button[@id=\"new-contact-button\"]")
    public WebElement newContactButton;

    @FindBy(css = "li[id='everyone'] div[class$='utils']")
    public WebElement contactsCount;

    @FindBy(css = "input[id='contact-fullname']")
    public WebElement fullNameInput;

    @FindBy(xpath = "//div[@class=\"vue-recycle-scroller__item-view\"]/div/div[@class=\"app-content-list-item-line-one\"]")
    public List<WebElement> contactList;

    @FindBy(css = ".action-item.header-menu button")
    public WebElement threeDotButton;

    @FindBy(css = "div.open button span.icon-delete")
    public WebElement deleteButton;

    @FindBy(css = "button[class$='icon-picture-force-white']")
    public WebElement changeProfilePictureButton;


    @FindBy(css = "html > body > div:nth-of-type(6) > div > div:nth-of-type(1) > div:nth-of-type(1) > div > ul > li:nth-of-type(2) > button")
    public WebElement chooseFromFileButton;

    @FindBy(xpath = "//tr[@data-entryname=\"manolya 2.jpeg\"]")
    public WebElement profilePicture;

    @FindBy(css = "button[class='primary']")
    public WebElement chooseButton;


    @FindBy(css = "span[class='action-link__text']")
    public WebElement downLoadPictureButton;

    @FindBy(xpath = "//div[@class=\"contact-header-avatar__photo\"]")
    public WebElement BackgroundUrlProfile;

    @FindBy(xpath = "//div[@class=\"empty-content\"]/p")
    public WebElement noContactSelected;


}
