package com.seleniummaster.java.webdriver.Steps;

import Pages.ShootingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertTrue;


public class ShootingPageSteps {

    ShootingPage SP = new ShootingPage();

    @Then("^the Shooting Page is displayed$")
    public void shootingPageIsDisplayed() throws Throwable {
        assertTrue(SP.isOnShootingPage());
    }

    @When("^I click on the Shooting Page Link$")
    public void iClickOnTheShootingPageLink() throws Throwable {
        SP.clickOnTheShootingPageLink();
    }
}
