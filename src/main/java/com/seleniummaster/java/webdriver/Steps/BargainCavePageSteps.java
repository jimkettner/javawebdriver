package com.seleniummaster.java.webdriver.Steps;

import Pages.BargainCavePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;


public class BargainCavePageSteps {

    BargainCavePage BCP = new BargainCavePage();


    @Then("^the Bargain Cave Page is displayed$")
    public void bargainCavePageIsDisplayed() throws Throwable {
        assertTrue(BCP.isOnBargainCavePage());
    }

    @When("^I click on the Bargain Cave Page link$")
    public void iClickOnTheBargainCavePageLink() throws Throwable {
        BCP.clickOnTheBargainCavePageLink();
    }
}
