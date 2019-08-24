package com.Pages;

import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDetailsPage extends Basepage {



    @FindBy(id = "searcheddrugname")
    private WebElement headname;
    @FindBy(xpath = "//*[@id=\"wag-body-main-container\"]/div[2]/section/div/section[2]/div[6]/section/section[1]/span/button")
    private WebElement Viewpagedetails;
    @FindBy(xpath = "//*[@id=\"wag-body-main-container\"]/section[2]/section[2]/section[2]/section[3]/p/a")
    private WebElement pricecheck;
    @FindBy(xpath = "//*[@id=\"DrugPricingInformation\"]/section[2]/strong")
    private WebElement pricedetails;

    public DragDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void Headnameverify(){
        String x=headname.getText();
        Assert.assertEquals("Claritin-D",x);
    }
    public void Viewpage(){
        Viewpagedetails.click();
    }
    public void pricechecklink(){
        pricecheck.click();
    }
    public void pricecheckverify(){
        String x=pricedetails.getText();
        Assert.assertEquals("Pricing without Insurance",x);
    }
}
