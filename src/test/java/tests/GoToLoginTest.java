package tests;

import driver.manager.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.LandingPage;

import static navigation.ApplicationURLs.LOGIN_URL;

public class GoToLoginTest extends TestBase{

    @Test
    public void goToLogin(){
        LandingPage landingPage=new LandingPage();
        landingPage.clickOnEnterStoreLink()
                .clickOnSignInLink();
       // Assert.assertEquals(driver.getCurrentUrl(), LOGIN_URL);
    }
}
