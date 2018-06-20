package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static Base.WebDriverBase.getDriverInstance;

public class CustomerServiceEMailPage extends BasePage {

    @FindBy(css = ".rn_Label.rn_ErrorLabel")
    private WebElement nameColor;

    @FindBy(id = "rn_FormSubmit_28_Button")
    private WebElement continueButton;

    @FindBy(id = ".tileEmail a:nth-of-type(1)")
    private WebElement customerServiceEmailLink;


    final String actualColor = "rgba(193, 0, 0, 1)";

    public String getNameColor() {
            return getDriverInstance().findElement(By.cssSelector(".rn_Label.rn_ErrorLabel")).getCssValue("color");
        }

        public String getEmailColor() {
            return getDriverInstance().findElement(By.id("rn_TextInput_18_Label")).getCssValue("color");
        }

        public String getSubjectColor() {
            return getDriverInstance().findElement(By.id("rn_TextInput_20_Label")).getCssValue("color");
        }

        public void clickCustomerServiceEmailLink() {
//        clickButton(customerServiceEmailLink);
            jsClick(customerServiceEmailLink);
        }

        public void clickContinueButton() {
            scrollElementIntoView(continueButton);
            WebElement formSubmit = getDriverInstance().findElement(By.id("rn_FormSubmit_28_Button"));
            new Actions(getDriverInstance()).moveToElement(formSubmit).click().perform();
        }

        public void contactFieldIsRed() {
           Assert.assertEquals(getNameColor(), actualColor);
           Assert.assertEquals(getEmailColor(), actualColor);
           Assert.assertEquals(getSubjectColor(), actualColor);
        }




}
