package Base;

import cucumber.api.java.en.Given;
import static Base.WebDriverBase.getDriverInstance;


public class BasePage{

    NavigationPage navigation = new NavigationPage();

    @Given("^I have navigated to the \"([^\"]*)\" url$")
    public void memberNavigatesToPage(String pageName){
        navigateToPageByURL(pageName);
    }

    private void navigateToPageByURL(String pageName) {
        String url = navigation.getUrl(pageName);

        getDriverInstance().navigate().to(url);
    }

}
