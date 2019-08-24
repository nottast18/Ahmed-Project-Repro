package com.Pages;


import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Homepage extends Basepage {

    @FindBy(xpath = " //div[@class='wag-dropdown-link']//div//a[contains(@class,'wag-head-text4 wag-hn-lt-55roman')]")
    private WebElement account;
    @FindBy(xpath="//*[@id=\"header\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/p/a[1]")
    private WebElement singin;
    @FindBy(name = "Ntt")
    private WebElement scarchbox;
    @FindBy(className ="icon_search_d" )
    private WebElement scarchbatton;
    @FindBy(className ="icon_logo_d" )
    private WebElement logo;
    @FindBy(id = "menu-prescrip-refills")
    private WebElement Refillstab;
    @FindBy(id = "drug_information")
    private WebElement Dragdetails;

    public Homepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void accountlink(){
        account.click();
    }
    public void Singinlink(){
        singin.click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    public void setScarchbox(){
        scarchbox.click();
        scarchbox.clear();
        scarchbox.sendKeys("Jock Itch Treatments");
    }
    public void setScarchbatton(){
        scarchbatton.click();

    }
    public void logoverify() {
        String X=logo.getText();
        Assert.assertEquals("Walgreens: Trusted since 1901",X);

    }
    public void Raxrefiles(){
        Actions actions = new Actions(driver);
        actions.moveToElement(Refillstab)
                .perform();
    }
    public void Dragdetailslink(){
        Dragdetails.click();

    }

}
