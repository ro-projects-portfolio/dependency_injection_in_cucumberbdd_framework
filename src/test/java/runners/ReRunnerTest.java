package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
// To get info about these options look JUnitRunnerTest
        features = "@target/rerun.txt",
        glue = {"steps","cucumber"},
        plugin = {
                "pretty",
                "rerun:target/rerun.txt",
                "html:target/default-cucumber-reports.html",
        }
)
public class ReRunnerTest {
}
