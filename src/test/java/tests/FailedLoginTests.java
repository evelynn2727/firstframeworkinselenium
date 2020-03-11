package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
        LandingPage landingPage=new LandingPage();
        TopMenuPage topMenuPage = new TopMenuPage();
        LoginPage loginPage= new LoginPage();

        landingPage.clickOnEnterStoreLink();
        topMenuPage.clickOnSignInLink();
        loginPage.typeIntoUserNameField("incorrect username");
        loginPage.typeIntoPasswordField("admin");
        loginPage.clickOnLoginButton();
        loginPage.getWarningMessage();
        String warningMessage=loginPage.getWarningMessage();
        Assert.assertEquals(warningMessage,"Invalid username or password. Signon failed.");
    }
}
