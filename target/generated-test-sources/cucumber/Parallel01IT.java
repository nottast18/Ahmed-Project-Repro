import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyDevelopment/WalgreensProject/src/test/resources/DragPriceVerify.feature:3"},
        plugin = {"json:C:/MyDevelopment/WalgreensProject/target/cucumber-report/json/1.json"},
        monochrome = false,
        glue = {"com/stepsDefinition"})
public class Parallel01IT {
}
