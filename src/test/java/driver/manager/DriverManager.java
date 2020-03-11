package driver.manager;

import driver.BrowserFactory;
import driver.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;
    private static final BrowserType BROWSER_TYPE = BrowserType.CHROME;

    public DriverManager() {
    }

    public static WebDriver getWebDriver(){
        if(driver==null){
            driver = BrowserFactory.getBrowser(BrowserType.CHROME);
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if(!BROWSER_TYPE.equals(BrowserType.CHROME)){
            driver.quit();
        }
        driver = null;
    }
}
