package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.*;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserlShallNotProceedToCheckout(){
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishImageButton()
                .clickOnAngelfish()
                .clickOnAddToCartSmallAngelfish()
                .clickOnProceedToCheckout();

        String message = loginPage.getWarningMessage();
        Assert.assertEquals(message,"You must sign on before attempting to check out. Please sign on and try checking out again.");

    }
}
