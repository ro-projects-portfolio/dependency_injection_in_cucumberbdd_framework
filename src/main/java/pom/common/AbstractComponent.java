package pom.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.pages.BasePage;

import static constants.Numeric.EXPLICITLY_WAIT_TIME;

/**
 * {@link AbstractComponent} class serves as a base class for components in a web application.
 * It provides common functionality, such as initializing the {@link WebDriver} and {@link WebDriverWait}, and defines
 * an abstract method to check if the component is displayed.
 */
public abstract class AbstractComponent {

    protected WebDriver driver;
    protected WebDriverWait wait;


    /**
     * Constructs a {@link AbstractComponent} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, EXPLICITLY_WAIT_TIME);
        PageFactory.initElements(driver, this); //
    }

    /**
     * Abstract method to check if the component is displayed on the web page.
     *
     * @return {@code true} if the component is displayed, {@code false} otherwise.
     */
    public abstract boolean isDisplayed();
}
