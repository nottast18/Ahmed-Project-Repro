import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyDevelopment/WalgreensProject/src/test/resources/emptycart.feature:3"},
        plugin = {"json:C:/MyDevelopment/WalgreensProject/target/cucumber-report/json/2.json"},
        monochrome = false,
        glue = {"com/stepsDefinition"})
public class Parallel02IT {
}
