package com.commonActions;



import com.util.DriverFactory;
import org.openqa.selenium.WebDriver;

public class StepBass {

   public WebDriver driver = DriverFactory.getInstance("CHLOUD").getDriver();
   protected Applicationcontroler walgreen = new Applicationcontroler(driver);
}
