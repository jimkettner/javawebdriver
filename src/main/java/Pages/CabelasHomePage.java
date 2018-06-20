package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class CabelasHomePage  extends BasePage {

    public boolean isOnCabelasHomePage(){
        return hasElementDisplayed(By.cssSelector(".shopDropdownContainer"));
        }
    }


