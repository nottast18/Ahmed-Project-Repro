package com.stepsDefinition;

import com.commonActions.StepBass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EmptyCartSteps extends StepBass {

    @Given("search product as{string}")
    public void search_product_as(String string) {
       walgreen.homePage().setScarchbox();
       walgreen.homePage().setScarchbatton();
    }

    @Then("user select first product of productlist")
    public void user_select_first_product_of_productlist() {
       walgreen.productListsPage().Selectproduct();
    }

    @Then("verify product name as {string}")
    public void verify_product_name_as(String string) {
      walgreen.productDetailsPage().productnameverify();
    }

    @Then("user click on add to card button.")
    public void user_click_on_add_to_card_button() {
       walgreen.productDetailsPage().addtocart();
    }

    @Then("user click cartview button")
    public void user_click_cartview_button() {
       walgreen.productDetailsPage().viewcartclick();
    }
    @Then("verify user in cartpage")
    public void verify_user_in_cartpage() {
       walgreen.cartPage().Shoppingcartverify();
    }

    @Then("user click on remove button")
    public void user_click_on_remove_button() {
  walgreen.cartPage().removefromcart();
    }

    @Then("verify cartempty massage display")
    public void verify_cartempty_massage_display() {
       walgreen.cartPage().cartemptyverify();
    }

}
