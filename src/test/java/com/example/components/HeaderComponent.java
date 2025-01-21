package com.example.components;

import com.example.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderComponent extends AbstractPage {
   

    @FindBy(css = ".panel.header")
    private WebElement header;

    @FindBy(css = "header .authorization-link")
    private WebElement loginLink;

    @FindBy(css = "header .logged-in")
    private WebElement loggedInGreetings;

    public HeaderComponent(WebDriver driver)  {
        super(driver);
    }

    public void verifyComponentLoaded() {
        wait.until(ExpectedConditions.visibilityOf(header));
    }

    public void clickOnLoginLink() {
        loginLink.click();
    }

    public void verifyLoggedIn() {
        wait.until(ExpectedConditions.visibilityOf(loggedInGreetings));
    }
}