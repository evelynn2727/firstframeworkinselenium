package tests;

import driver.manager.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import driver.manager.DriverManager;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest(){
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void afterTest(){
        DriverManager.disposeDriver();
    }
}
