package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelfishListPage {
    private Logger logger = LogManager.getRootLogger();


    @FindBy(css= "tbody > tr:nth-of-type(3) .Button")
    private WebElement smallAngelfishAddToCardButton;

    public AngelfishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAddToCartSmallAngelfish(){
        smallAngelfishAddToCardButton.click();
        logger.info("Clicked Angel Fish Add to card Button");
    }
}
