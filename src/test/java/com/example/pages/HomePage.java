package com.example.pages;

import com.example.utils.EnvProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(css = ".block-promo.home-main")
    private WebElement homePagePromo;

    @FindBy(css = " .qc-cmp2-summary-buttons [mode=primary]")
    private WebElement submitCookies;



    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static HomePage openViaUrl(WebDriver driver) {
        driver.get(EnvProperties.getProperty("BASE_URL"));
        HomePage homePage = new HomePage(driver);
        homePage.verifyPageLoaded();
        return homePage;
    }

    public void submitCookies() {
        waitForClickabilityAndClickOn(submitCookies);
    }

    public void verifyPageLoaded() {
        waitForElementVisible(homePagePromo);
    }
}