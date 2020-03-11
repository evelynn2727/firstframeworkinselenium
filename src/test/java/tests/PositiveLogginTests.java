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
        TopMenuPage topMenuPage = new TopMenuPage();
        LoginPage loginPage= new LoginPage();
        FooterPage footerPage =new FooterPage();

        landingPage.clickOnEnterStoreLink();
        topMenuPage.clickOnSignInLink();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        boolean bannerLogo = footerPage.isBannerAfterLoginDisplayed();
        Assert.assertTrue(bannerLogo);
    }

}
