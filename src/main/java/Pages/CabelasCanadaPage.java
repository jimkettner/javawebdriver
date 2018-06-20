package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class CabelasCanadaPage extends BasePage {


    public boolean isOnCabelasCanadaPage() {
        return hasElementDisplayed(By.cssSelector(".container.holiday2top"));
     }
}


