package com.seleniummaster.java.webdriver.Steps;

import Pages.CabelasCanadaPage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;

public class CabelasCanadaSteps {

    CabelasCanadaPage CCP = new CabelasCanadaPage();

    @Then("^the Canada Home Page is displayed$")
    public void userMovesToCabelasCanadaPage() throws Throwable {
        assertTrue(CCP.isOnCabelasCanadaPage());
    }


}
