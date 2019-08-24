package com.stepsDefinition;

import com.commonActions.StepBass;
import com.util.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;


public class Hooks extends StepBass {
    @Before
        public void setUp() {

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.walgreens.com");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        }

     @After
        public void tearDown() {
        DriverFactory.getInstance().removeDriver();

    }

    }

