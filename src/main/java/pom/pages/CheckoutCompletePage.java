package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.components.checkoutcomplete.CheckoutCompleteContainer;

/**
 * {@link CheckoutCompletePage} class represents the page containing the page details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link CheckoutCompleteContainer} components.
 */
@Getter // lombok to generate getters
public class CheckoutCompletePage extends BasePage {
    private final CheckoutCompleteContainer checkoutCompleteContainer;

    /**
     * Constructs a {@link CheckoutCompletePage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
        checkoutCompleteContainer = PageFactory.initElements(driver, CheckoutCompleteContainer.class); // initialize CheckoutCompleteContainer component
    }

    @Override
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }
}
