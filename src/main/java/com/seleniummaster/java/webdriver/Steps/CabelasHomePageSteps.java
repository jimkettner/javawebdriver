package com.seleniummaster.java.webdriver.Steps;

import Pages.CabelasHomePage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.assertTrue;

public class CabelasHomePageSteps {

    CabelasHomePage CHP = new CabelasHomePage();

    @Then("^the Cabelas Home Page will be displayed")
    public void user MovesToCabelasHomePage() throws Throwable {
        assertTrue(CHP.isOnCabelasHomePage());
    }

}
