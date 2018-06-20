package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CabelasFreeShippingPage extends BasePage {

//<img src="/content/dam/assets/Cabelas/Global/GlobalBanner/2018/Q1/SW_DT_010818a_FREESHIP.jpg" alt="FREE Shipping - $50 minimum" style="max-width:692px">

    public static WebElement element;

    public boolean isOnCabelasFreeShippingPage(){
        return hasElementDisplayed(By.cssSelector(".headingPageTitle2"));

    }
}
