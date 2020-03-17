package tests;

import driver.manager.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;

import static navigation.ApplicationURLs.LOGIN_URL;

public class PositiveLogginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword(){
        DriverUtils.navigateToPage(LOGIN_URL);
        LoginPage loginPage = new LoginPage();

        boolean isBannerAfterLoginDisplayed = loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();
        Assert.assertTrue(isBannerAfterLoginDisplayed);
    }
}
