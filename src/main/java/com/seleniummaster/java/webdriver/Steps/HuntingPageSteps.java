package com.seleniummaster.java.webdriver.Steps;

import Pages.HuntingPage;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertTrue;

public class HuntingPageSteps {

    HuntingPage HP = new HuntingPage();

    @Then("^the Hunting Page is displayed$")
    public void huntingPageIsDisplayed() throws Throwable {
        assertTrue(HP.isOnHuntingPage());
    }
    @When("^I click on the Hunting Page link$")
    public void iClickOnTheHuntingPageLink() throws Throwable {
        HP.clickOnTheHuntingPageLink();
    }
}
