package com.seleniummaster.java.webdriver.Steps;

import Pages.CabelasFAQPage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;

public class CabelasFAQPageSteps {

    CabelasFAQPage CFAQP = new CabelasFAQPage();

    @Then("^ the Cabelas FAQ Page is displayed$")
    public void userMovesToCabelasFAQPage() throws Throwable {
        assertTrue(CFAQP.isOnCabelasFAQPage());
    }

}