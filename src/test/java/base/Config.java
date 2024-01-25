package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;

public class Config {

    public static WebDriver driver;

    //setup browser type
    public static WebDriver setupBrowser(String driverType) {

        if (driverType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (driverType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (driverType.equalsIgnoreCase("safari")) {
            SafariOptions options = new SafariOptions();
            options.setUseTechnologyPreview(true);
            driver = new SafariDriver(options);
        }
        driver.manage().window().maximize();
        // Set the implicit wait time to 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

}
