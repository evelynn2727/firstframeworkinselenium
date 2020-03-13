package page.objects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class MainPage {

    private Logger logger = LogManager.getRootLogger();


    @FindBy(css = "[src='../images/fish_icon.gif']")
    private WebElement fishButton;

    public MainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void goToFishCategory(){
        fishButton.click();
        logger.info("Clicked Fish Button");
    }
}
