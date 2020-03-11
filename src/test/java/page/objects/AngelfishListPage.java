package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class AngelfishListPage {

    @FindBy(css= "tbody > tr:nth-of-type(3) .Button")
    private WebElement smallAngelfishAddToCardButton;

    public AngelfishListPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAddToCartSmallAngelfish(){
        smallAngelfishAddToCardButton.click();
    }
}
