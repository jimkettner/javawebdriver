package com.seleniummaster.java.webdriver.Steps;

import Pages.LearnPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;

public class LearnPageSteps {

    LearnPage LP = new LearnPage();

    @Then("^the Learn Page is displayed$")
    public void learnPageIsDisplayed() throws Throwable {
        assertTrue(LP.isOnLearnPage());
    }
    @When("^I click on the Learn Page Link$")
    public void iCLickOnTheLearnPageLink() throws Throwable {
        LP.clickOnTheLearnPageLink();

    }
}
