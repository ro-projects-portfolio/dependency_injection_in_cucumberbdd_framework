package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class) // provide connection with JUnit
@CucumberOptions(
        // features | path from content root
        features = "src/test/resources/features",// locate feature files
        // glue | path from source root
        glue = {"steps", "cucumber"}, // locate other cucumber features
        //tags = "@Debug", // for filtering tests
        dryRun = false, // if assigned true will define undefine Gherkin steps from feature files
        snippets = CAMELCASE, // this snippets convert step in camel case (use in pair with summary plugin)
        plugin = {
                "pretty", // for more readable console output
                "rerun:target/rerun.txt", // provide txt file with failed tests (based on this file work ReRunnerTest)
                "html:target/default-cucumber-reports.html", // provide cucumber report
                "summary" // need for CAMELCASE snippets
        }
)

public class JUnitRunnerTest {

}
