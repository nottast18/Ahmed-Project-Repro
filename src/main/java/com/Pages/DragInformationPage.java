package com.Pages;

import com.commonActions.Basepage;
import com.sun.org.apache.xpath.internal.compiler.Keywords;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragInformationPage extends Basepage {

    @FindBy(xpath = "//h1[@class='heading-h2']")
    private WebElement Dragpage;
    @FindBy(id = "input-1")
    private WebElement Dragkeyword;
    @FindBy(css = "#wag-drug-info-interchange-container > section > div.col-lg-8.col-sm-8.col-md-8.col-12.p0.mt20 > div > div > span")
    private WebElement Scarchicon;

    public DragInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void DragPageverify(){
        String x=Dragpage.getText();
        Assert.assertEquals("Drug Information",x);
    }
    public void Keywordclick(){
Dragkeyword.sendKeys("Claritin-D");

    }
    public void Scarchiconlink(){
        Scarchicon.click();
    }
}
