import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/MyDevelopment/WalgreensProject/src/test/resources/login.feature:3"},
        plugin = {"json:C:/MyDevelopment/WalgreensProject/target/cucumber-report/json/3.json"},
        monochrome = false,
        glue = {"com/stepsDefinition"})
public class Parallel03IT {
}
