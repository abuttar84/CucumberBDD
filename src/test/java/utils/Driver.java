package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * This class is a Singleton class. It will make sure that there is a only one instance
 * of WebDriver at any given time
 */
public class Driver {
    private static String propertyPath = "src/test/resources/conf/configuration.properties";
    private static WebDriver driver;
    private static final String sauceUser = ConfigReader.readProperty("sauceUsername",propertyPath);
    private static final String sauceKey = ConfigReader.readProperty("sauceKey",propertyPath);
    private static final String URL = "https://"+ sauceUser +":"+ sauceKey +"@ondemand.us-west-1.saucelabs.com:443/wd/hub";
    /**
     * This method is used to get instance of a WebDriver object. If it is null, new instance will be created.
     * @return will return WebDriver object
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            if(ConfigReader.readProperty("executeTestLocally",propertyPath).equalsIgnoreCase("false"))
                driver=getRemoteDriver();
            switch (ConfigReader.readProperty("browser", propertyPath)) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser type");
            }
        }
        return driver;
    }
    /**
     * This method will close all open browsers of current WebDriver object and initialize it as null
     */
    public static void quitDriver(){
        getDriver().quit();
        driver = null;
    }
    public static WebDriver getRemoteDriver(){
        WebDriver driver = null;
        try{
            DesiredCapabilities dp =DesiredCapabilities.chrome();
            dp.setCapability("browserName","chrome");
            dp.setCapability("version",ConfigReader.readProperty("browser_version",propertyPath));
            dp.setCapability("platform",ConfigReader.readProperty("os",propertyPath));
            driver = new RemoteWebDriver(new URL(URL),dp);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return driver;
    }
}
