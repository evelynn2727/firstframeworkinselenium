package page.objects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class FishListPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tbody > tr:nth-of-type(2) a")
    private WebElement angelfishIdLink;

    public FishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfish(){
        angelfishIdLink.click();
        logger.info("Clicked on Angel Fish");
    }
}
