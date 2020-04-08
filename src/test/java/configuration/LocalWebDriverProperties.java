package configuration;

import driver.BrowserType;

public class LocalWebDriverProperties {
    //metody zwracaja wlasciwosci dla poszczegolnych kluczy, analogicznie jak w przypadku appPtoperties

    public static String getChromeWebDriverLocation(){
        return ConfigurationProperties.getProperties().getProperty("chrome.driver.location");
    }

    public static String getFirefoxWebDriverLocation(){
        return ConfigurationProperties.getProperties().getProperty("firefox.driver.location");
    }

    public static String getInternetExplorerWebDriverLocation(){
        return ConfigurationProperties.getProperties().getProperty("ie.driver.location");
    }
}
