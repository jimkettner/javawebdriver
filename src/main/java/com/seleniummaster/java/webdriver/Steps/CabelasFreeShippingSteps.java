package com.seleniummaster.java.webdriver.Steps;

import Pages.CabelasFreeShippingPage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;

public class CabelasFreeShippingSteps {

    CabelasFreeShippingPage CFSP = new CabelasFreeShippingPage();

    @Then("^the Cabelas Free Shipping Page is displayed$")
    public void userMovesToCabelasFreeShippingPage() throws Throwable {
        assertTrue(CFSP.isOnCabelasFreeShippingPage());
    }
}
