package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishingPage extends BasePage {

    @FindBy(linkText = "FISHING")
    private WebElement fishingPageLink;

//    @FindBy(css = ".shopDropdown a:nth-of-type(3)")
//    private WebElement fishingPageLink;

    @FindBy(css = ".icon-headerNavArrowGreen")
    private WebElement shopDropDown;

    public boolean isOnFishingPage() {
        return hasElementDisplayed(By.cssSelector(".subCategoryTitle"));
    }

    public void clickOnTheFishingPageLink(){
//        clickButton(shopDropDown);
//        clickButton(fishingPageLink);
//        jsClick(shopDropDown);
        jsClick(fishingPageLink);
    }

//    Actions builder = new Actions(getDriverInstance());
//
//    builder.moveToElement(fishingPageLink).perform();
//
//    By locator = By.id("clickFishingPageLink");
//
//    driver.click(locator);
//    }
}
