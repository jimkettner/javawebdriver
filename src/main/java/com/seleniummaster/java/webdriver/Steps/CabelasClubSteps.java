package com.seleniummaster.java.webdriver.Steps;

import Pages.CabelasClubPage;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertTrue;

public class CabelasClubSteps {

    CabelasClubPage CCS = new CabelasClubPage();

    @Then("^the Cabelas Club Page is displayed$")
    public void userMovesToCabelasClubPage() throws Throwable {
        assertTrue(CCS.isOnCabelasClubPage());
    }
}
