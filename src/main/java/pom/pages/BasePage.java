package pom.pages;

import org.openqa.selenium.WebDriver;
import utils.ConfigurationFileReader;

/**
 * {@link BasePage} is an abstract class representing a base page in a web application.
 * It provides a common structure for all page classes.
 */
public abstract class BasePage {

    protected WebDriver driver; //

    /**
     * Constructs a {@link BasePage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * Abstract method to retrieve the URL of the page.
     *
     * @return The URL of the page.
     */
    public abstract String getUrl();

    public void load(String endPoint) {
        driver.get(ConfigurationFileReader.getInstance().getBaseUri() + endPoint);
    }
}
