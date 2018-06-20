package com.seleniummaster.java.webdriver.Steps;

import Pages.CustomerServiceEMailPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CustomerServiceEMailPageSteps {

    CustomerServiceEMailPage EMP = new CustomerServiceEMailPage();


    @When("^I click on the Customer Service Email link$")
    public void iClickOnTheCustomerServiceEmailLink() throws Throwable {
    EMP.clickCustomerServiceEmailLink();
    }

    @When("^I click on the Continue button$")
    public void iClickOnTheContinueButton() throws Throwable {
    EMP.clickContinueButton();
    }

    @Then("^the contact fields turn red$")
    public void nameField() throws Throwable {
        EMP.contactFieldIsRed();
    }


}
