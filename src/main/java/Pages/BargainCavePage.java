package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BargainCavePage extends BasePage{

    @FindBy(css = ".navSaveBargainCaveBold")
    private WebElement bargainCaveDropdown;

    @FindBy(css = ".saveFlyoutSection")
    private WebElement bargainCaveFlyout;


    public boolean isOnBargainCavePage() {
        return hasElementDisplayed(By.cssSelector(".saveContainer"));
    }

    public void clickOnTheBargainCavePageLink() {
        clickButton(bargainCaveDropdown);
//        jsClick(bargainCaveDropdown);

        clickButton(bargainCaveFlyout);
//        jsClick(bargainCaveFlyout);
    }
}
