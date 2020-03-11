package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;

public class MainPage {

    @FindBy(css = "[src='../images/fish_icon.gif']")
    private WebElement fishButton;

    public MainPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void goToFishCategory(){
        fishButton.click();
    }
}
