package Pages;

import Base.BasePage;
import org.openqa.selenium.By;


public class CabelasFAQPage extends BasePage {

    public boolean isOnCabelasFAQPage(){
        return hasElementDisplayed(By.cssSelector("#comhdrlayertwo"));
   }
}



