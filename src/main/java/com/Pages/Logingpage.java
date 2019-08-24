package com.Pages;


import com.commonActions.Basepage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Logingpage extends Basepage {


    @FindBy(name = "userNameOrPhone")
    private WebElement username;
    @FindBy(id = "continueBtn")
    private WebElement continueBaton;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(id = "passwordtabSignIn")
    private WebElement singinbaton;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/a/span")
    private WebElement Loginmassage;

    public Logingpage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void usernamelink(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        username.click();
        username.clear();
        username.sendKeys("chowdhurytaeem@gmail.com");
    }
    public void ContinueBatonlink(){
        continueBaton.click();
    }
    public void Passwordbuton(){
        password.click();
        password.clear();
        password.sendKeys("nottast@18");
    }

    public void Singinbatonlink(){
    singinbaton.click();
    }
   public void Loginmassagelink()
    {
        String X=Loginmassage.getText();
        Assert.assertEquals("Hi, Ahmed",X);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }



}

