package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Utility class that provides a method to initialize a WebDriver instance based on the specified browser type.
 */
public class DriverFactory {
    private DriverFactory() {
    }

    /**
     * Initializes a {@link WebDriver} instance based on the specified browser type.
     *
     * @param browser The type of browser to initialize.
     * @return A {@link WebDriver} instance configured for the specified browser.
     * @throws IllegalStateException if an undefined browser type is provided.
     */

    public static WebDriver initializeDriver(String browser) {
        // With Dependency Injection there is no more reason to use synchronize instance of WebDriver (What is common for Junit/Cucumber)
        // Dependency Injection will provide a new copy of initialize WebDriver each time
        WebDriver driver;
        switch (browser.toLowerCase()) {
            case "chrome" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            default -> throw new IllegalStateException("Undefined browser type " + browser);
        }

        driver.manage().window().maximize(); // maximize window size
        return driver;
    }

}
