package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Base.WebDriverBase.getDriverInstance;

public class HuntingPage extends BasePage{

    @FindBy(css = "MM")
    private WebElement shopDropDown;

    @FindBy(css = ".shopDropdown a:nth-of-type(1)")
    private WebElement huntingPageLink;

    @FindBy(css = ".subCategoryTitle")
    private WebElement huntingPageSubcategoryLink;

    public void clickOnTheHuntingPageLink(){
//        Actions action = new Actions(getDriverInstance());

//        action.moveToElement(huntingPageLink).perform();

//        WebElement subElement = getDriverInstance().findElement(By.LinkText("Hunting"));

//        action.moveToElement(subElement);

//        action.click();

//        action.perform();
//        clickButton(huntingPageLink);
        JavascriptExecutor js = (JavascriptExecutor) getDriverInstance();
        js.executeScript("window.document.getElement(By.cssSelector('.shopDropdown a:nth-of-type(1)'')).click()");

    }

    public boolean isOnHuntingPage(){
        waitForElement(huntingPageSubcategoryLink);
        return hasElementDisplayed(By.cssSelector(".subCategoryTitle"));
    }
}
