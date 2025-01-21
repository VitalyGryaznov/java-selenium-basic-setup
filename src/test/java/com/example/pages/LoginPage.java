package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "pass")
    private WebElement passwordInput;

    @FindBy(css = ".action.login.primary")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void verifyPageLoaded() {
        waitForElementVisible(passwordInput);
    }

    public void enterCredentials(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }

    public void submitForm() {
        submitButton.click();
    }
}