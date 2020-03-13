package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

public class FailedLoginTests extends TestBase {

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword(){
       LandingPage landingPage = new LandingPage();

        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("incorrect username")
                .typeIntoPasswordField("admin")
                .clickOnLoginButton();
        LoginPage loginPage= new LoginPage();
        String warningMessage = loginPage.getWarningMessage();
        Assert.assertEquals(warningMessage,"Invalid username or password. Signon failed.");
    }
}
