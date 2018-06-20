package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LearnPage extends BasePage {

    @FindBy(css = ".learnContainer")
    private WebElement learnPageDropdown;

    @FindBy(css = ".icon-headerInYourNature")
    private WebElement itsInYourNatureElement;

    public boolean isOnLearnPage() {
        return hasElementDisplayed(By.cssSelector(".herotext"));
    }
    public void clickOnTheLearnPageLink() {
//        clickButton(learnPageDropdown);
        jsClick(learnPageDropdown);

//        clickButton(itsInYourNatureElement);
        jsClick(itsInYourNatureElement);
    }

}
