package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyTestDefts extends Util{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
    // user is on home page
    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {

    }  // user should be able to click on register button;
    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homePage.clickOnRegisterButton();
    }


      // user should be able to required all  information
    @When("^user enter all required registration details$")
    public void user_enter_all_required_registration_details()  {
        registerPage.userEnterREgistrationDetails();

    }
      //user should be able to click on register submit  button;
    @When("^user Clicks on register-submit button$")
    public void user_Clicks_on_register_submit_button() {
        registerPage.userClickOnRegester();

    }   // varify user is on register page

    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()  {
        registerSuccessPage.userIsOnRegesterPage();

    }
























}
