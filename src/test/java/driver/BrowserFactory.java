package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
    public static WebDriver getBrowser(BrowserType browserType){
        switch (browserType){
            case CHROME:
                System.setProperty("webdriver.chrome.driver","C:\\Users\\eweli\\IdeaProjects\\firstframeworkinselenium\\chromedriver.exe");
                return new ChromeDriver();
            case FIREFOX:

                System.setProperty("webdriver.gecko.driver","C:\\Users\\eweli\\IdeaProjects\\firstframeworkinselenium\\geckodriver.exe");
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver","C:\\Users\\eweli\\IdeaProjects\\firstframeworkinselenium\\IEDriverServer.exe");
                return new InternetExplorerDriver();
            default:
                throw new IllegalStateException("Uknow browser type! Please check your configuration!");
        }
    }
}
