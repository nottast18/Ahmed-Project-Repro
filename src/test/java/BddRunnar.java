import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       //dryRun = true,
         tags = { "@Debug" },
        //tags = { "@smoke" },         /* smoke test only */
        //tags = { "@Acceptance,@Functional" }, /* debug or smoke test */
        //tags = { "@Smoke","@Functional" },  /* debug and smoke test */

        //monochrome = true,
        features = "C:/MyDevelopment/WalgreensProject/src/test/resources",

        glue = "com/stepsDefinition",

        plugin={
        "pretty:target/cucumber-test-report/cucumber-pretty.txt",
        "junit:target/cucumber-report/test-report.xml",
        "json:target/cucumber-report/cucumber-report.json",
        "html:target/cucumber-report/plain"
}
)
public class BddRunnar {
}
