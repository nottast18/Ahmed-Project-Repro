package com.stepsDefinition;

import com.commonActions.StepBass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends StepBass {

    @Given("user click on Your Account button.")
    public void user_click_on_Your_Account_button() {
    walgreen.homePage().accountlink();
    }

    @Then("user click on Sing in button.")
    public void user_click_on_Sing_in_button() {
    walgreen.homePage().Singinlink();

    }

    @When("user enter user email as {string}")
    public void user_enter_user_email_as(String string) {
   walgreen.logingpage().usernamelink();
    }

    @When("user click on Continue button.")
    public void user_click_on_Continue_button() {
      walgreen.logingpage().ContinueBatonlink();
    }

    @Then("user enter password as {string}")
    public void user_enter_password_as(String string) {
      walgreen.logingpage().Passwordbuton();
    }

    @Then("User click sing in button.")
    public void user_click_sing_in_button() {
        walgreen.logingpage().Singinbatonlink();
    }

    @Then("login success message display.")
    public void login_success_message_display() {
 walgreen.logingpage().Loginmassagelink();
    }


}
