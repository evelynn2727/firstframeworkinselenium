package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class ShoppingCardPage {

    @FindBy(css = "a[href$='newOrderForm=']")
    private WebElement preceedToCheckoutButton;

    public ShoppingCardPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnProceedToCheckout(){
        preceedToCheckoutButton.click();
    }
}
