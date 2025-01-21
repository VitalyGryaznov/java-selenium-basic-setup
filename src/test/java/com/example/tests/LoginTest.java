package com.example.tests;

import com.example.components.HeaderComponent;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import org.junit.jupiter.api.Test;

public class LoginTest extends AbstractTest {
    @Test
    public void userCanLoginFromHomePage() {
        HomePage homePage = HomePage.openViaUrl(driver);

        HeaderComponent headerComponent = new HeaderComponent(driver);
        headerComponent.verifyComponentLoaded();
        headerComponent.clickOnLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyPageLoaded();
        loginPage.enterCredentials("aqa@test.com", "Password13@");
        loginPage.submitForm();

        homePage.verifyPageLoaded();
        headerComponent.verifyLoggedIn();
    }
}
