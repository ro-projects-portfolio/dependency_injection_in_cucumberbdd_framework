package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.components.checkouttwo.CheckoutTwoFooter;
/**
 * {@link CheckoutTwoPage} class represents the page containing the page details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link CheckoutTwoFooter} components.
 */
@Getter // lombok to generate getters
public class CheckoutTwoPage extends BasePage{
    private final CheckoutTwoFooter checkoutTwoFooter;


    /**
     * Constructs a {@link CheckoutTwoPage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public CheckoutTwoPage(WebDriver driver) {
        super(driver);
        checkoutTwoFooter = PageFactory.initElements(driver, CheckoutTwoFooter.class);
    }

    @Override
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }
}
