package com.Pages;

import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListsPage extends Basepage {

    @FindBy(id = "wagSearchKeywordHeader")
    private WebElement productpage;
    @FindBy(id = "title-secondary-0compare_sku352272")
    private WebElement Product;

    public ProductListsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void productpageverify() {
        String X=productpage.getText();
        Assert.assertEquals("Jock Itch Treatments",X);
    }
    public void Selectproduct(){
        Product.click();
    }
}
