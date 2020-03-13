package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

public class PositiveLogginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword(){
        LandingPage landingPage=new LandingPage();

        boolean isBannerAfterLoginDisplayed = landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();
        Assert.assertTrue(isBannerAfterLoginDisplayed);
    }

}
