package com.Pages;

import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CartPage extends Basepage {

    @FindBy(id = "wag-cart-shopping-lbl")
    private WebElement shoppingcart;
    @FindBy(id = "wag-cart-qty-input_9104430")
    private WebElement productnumber;
    @FindBy(id = "wag-cart-remove_sku352272")
    private WebElement remove;
    @FindBy(id = "wag-cart-empty-lbl")
    private WebElement emptymassage;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void Shoppingcartverify()
    {
        String X=shoppingcart.getText();
        Assert.assertEquals("Shopping Cart",X);
    }

    public void productnumberverify()
    {
        String X=shoppingcart.getText();
        Assert.assertEquals("1",X);
    }
    public void removefromcart(){
        remove.click();
    }
    public void cartemptyverify()
    {
        String X=emptymassage.getText();
        Assert.assertEquals("Your Cart is empty",X);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

}
