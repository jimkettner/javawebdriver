package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShootingPage extends BasePage {

    @FindBy(css = "MM")
    private WebElement shopDropDown;

    @FindBy(xpath = ".shopDropdown a:nth-of-type(2)")
    private WebElement shootingPageLink;

    public boolean isOnShootingPage() {
        return hasElementDisplayed(By.cssSelector(".subCategoryTitle"));
    }

    public void clickOnTheShootingPageLink(){
//        clickButton(shopDropDown);
        jsClick(shopDropDown);
//        clickButton(shootingPageLink);
        jsClick(shootingPageLink);
    }

}
