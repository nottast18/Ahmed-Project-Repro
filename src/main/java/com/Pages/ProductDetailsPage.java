package com.Pages;

import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends Basepage {

    @FindBy(id = "productTitle")
    private WebElement productname;
    @FindBy(id = "receiveing-addToCartbtn")
    private WebElement cart;
    @FindBy(id = "addToCart-cart-checkout")
    private WebElement viewcart;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void productnameverify()
    {
        String X=productname.getText();
        Assert.assertEquals("Lotrimin AF Antifungal for Jock Itch, Clotrimazole Cream",X);
    }

    public void addtocart(){
        cart.click();
    }
    public void viewcartclick(){
        viewcart.click();
    }


}
