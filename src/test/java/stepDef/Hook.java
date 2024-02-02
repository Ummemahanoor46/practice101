package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.util.Strings;

public class Hook extends Config {

    public static String url;
    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");


    @Before
    public void beforeEachTest(){
        if (Strings.isNullOrEmpty(envType)){
            envType = "qa";
        }
        if (Strings.isNullOrEmpty(browserType)){
            browserType = "ch";
        }
        driver = setupBrowser(browserType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                STUDENT_EMAIL = "qa.env@gmail.com";
                STUDENT_PASSWORD = "1234567890";
                break;
            case "stage":
                url = "https://stage.taltektc.com";
                STUDENT_EMAIL = "stage.env@gmail.com";
                STUDENT_PASSWORD = "stagePas$123";
                break;
            case "prod":
                url = "https://prod.taltektc.com";
                break;
        }
        driver.get(url);

    }

    @After
    public void afterEachTest(){
        //driver.quit();
        // take screenshot if test steps or case fail
        // close db connection
    }


}
