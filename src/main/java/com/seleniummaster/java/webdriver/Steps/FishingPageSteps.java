package com.seleniummaster.java.webdriver.Steps;

import Pages.FishingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

public class FishingPageSteps {

    FishingPage FP = new FishingPage();

    @Then("^the Fishing Page is displayed$")
    public void fishingPageIsDisplayed() throws Throwable {
        assertTrue(FP.isOnFishingPage());
}
    @When("^I click on the Fishing Page link$")
    public void iCLickOnTheFishingPageLink() throws Throwable {
        FP.clickOnTheFishingPageLink();
    }
}
