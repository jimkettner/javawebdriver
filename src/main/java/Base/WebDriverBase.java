package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class WebDriverBase {


    private static WebDriver driver = new FirefoxDriver();

    public static WebDriver getDriverInstance(){
        return driver;
    }




}
