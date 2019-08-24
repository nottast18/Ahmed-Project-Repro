package com.commonActions;

import org.openqa.selenium.WebDriver;

public class Basepage {
    protected WebDriver driver;

    public Basepage(WebDriver driver) {
        this.driver = driver;
    }
}
