package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;

public class Config {

    public static WebDriver driver;

    public static String STUDENT_EMAIL;
    public static String STUDENT_PASSWORD;
    public static WebDriver setupBrowser (String driverType){
        if(driverType.equalsIgnoreCase("ch")){
            driver = new ChromeDriver();
        } else if (driverType.equalsIgnoreCase("ff")) {
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
        } else if (driverType.equalsIgnoreCase("sf")){
            SafariOptions options = new SafariOptions();
            options.setUseTechnologyPreview(true);
            driver = new SafariDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}


