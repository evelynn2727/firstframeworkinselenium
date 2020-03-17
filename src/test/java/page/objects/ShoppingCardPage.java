package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class ShoppingCardPage {
    private Logger logger = LogManager.getRootLogger();


    @FindBy(css = "a[href$='newOrderForm=']")
    private WebElement preceedToCheckoutButton;

    public ShoppingCardPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnProceedToCheckout(){
        preceedToCheckoutButton.click();
        logger.info("Clicked on proceed to checkout");
       // /fsdfsdfsdfsdfsfs
    }
}
