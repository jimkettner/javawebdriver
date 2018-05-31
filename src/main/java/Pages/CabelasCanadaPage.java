package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class CabelasCanadaPage extends BasePage {

/*
private static final String class="headerNavCabelasCanadaLink";
public String url = String.format("https://www.cabelas.com/");
*/

    public boolean isOnCabelasCanadaPage() {
          return CabelasCanadaPage(By.ByClassName(class="headerNavCabelasCanadaLink"));
     }
}


