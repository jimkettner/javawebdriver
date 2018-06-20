package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class WebDriverBase {

    private static WebDriver driver = new ChromeDriver();

    public static WebDriver getDriverInstance(){

        return driver;
    }


}
