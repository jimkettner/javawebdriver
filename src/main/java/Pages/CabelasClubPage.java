package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CabelasClubPage extends BasePage {


    public static WebElement element;

    public boolean isOnCabelasClubPage(){
        return hasElementDisplayed(By.cssSelector(".headerNavClubLink"));


    }
}

