package com.demoblaze.step_definitions;

import com.demoblaze.pages.SignupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup_StepDefs {
    SignupPage signupPage=new SignupPage();

    @When("The user clicks on signup button and enters {string} {string} details")
    public void theUserClicksOnSignupButtonAndEntersDetails(String username, String password) {
        signupPage.signup(username, password);
    }


    @Then("The user verifies Success message {string}")
    public void theUserVerifiesSuccessMessage(String exceptedMessage) {
        signupPage.verifySuccessCredentailsPopUpMessage(exceptedMessage);

    }
}
