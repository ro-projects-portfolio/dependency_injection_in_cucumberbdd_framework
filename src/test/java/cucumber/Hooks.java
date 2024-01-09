package cucumber;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.ConfigurationFileReader;
import utils.DriverFactory;

/**
 * Hooks class containing setup and teardown methods for scenarios in Cucumber tests.
 */
public class Hooks {
    private WebDriver driver;
    private final TestContext context; // we need this value to assign and get values to/from container

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public Hooks(TestContext context) {// constructor for dependency injection
        this.context = context;
    }

    /**
     * Setup method executed before each scenario.
     *
     * @param scenario The Cucumber scenario object representing the current scenario.
     */
    @Before
    public void before(Scenario scenario) {
        System.out.println("Scenario name : " + scenario.getName());
        driver = DriverFactory.initializeDriver(ConfigurationFileReader.getInstance().getBrowser());
        context.driver = driver; // to assign value to container related class instance from context should be present
    }

    /**
     * Teardown method executed after each scenario.
     *
     * @param scenario The Cucumber scenario object representing the current scenario.
     */
    @After
    public void after(Scenario scenario) {
        System.out.println("Scenario status = " + scenario.getStatus());
        if (scenario.isFailed()) {
            byte[] data = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        } // Simple example of receiving screenshot with Selenium TakesScreenshot interface
        driver.quit();
    }
}
