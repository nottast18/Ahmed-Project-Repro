package com.stepsDefinition;

import com.commonActions.StepBass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class DrugPriceSteps extends StepBass {

   /* @Given("Verify user in HomePage")
    public void verify_user_in_HomePage() {
        walgreen.homePage().logoverify();
    }*/

    @Given("User move mouse in Rx Refills")
    public void user_move_mouse_in_Rx_Refills() {
       walgreen.homePage().Raxrefiles();
    }

    @Then("User click on Druginformation button.")
    public void user_click_on_Druginformation_button() {
     walgreen.homePage().Dragdetailslink();
    }

    @When("User enter name in searchbox.")
    public void user_enter_name_in_searchbox() {

        walgreen.dragInformationPage().Keywordclick();
    }

    @When("User click on search button.")
    public void user_click_on_search_button() {
        walgreen.dragInformationPage().Scarchiconlink();
    }

    @Then("Verify user in DrugDetailspage.")
    public void verify_user_in_DrugDetailspage() {
walgreen.dragDetailsPage().Headnameverify();

    }

    @Then("User click View Drag details button.")
    public void user_click_View_Drag_details_button() {
                walgreen.dragDetailsPage().Viewpage();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Then("User click price information button.")
    public void user_click_price_information_button() {
walgreen.dragDetailsPage().pricechecklink();
    }

    @Then("Verify price information details.")
    public void verify_price_information_details() {
walgreen.dragDetailsPage().pricecheckverify();
    }

}
