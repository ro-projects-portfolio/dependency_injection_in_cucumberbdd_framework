package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.components.checkoutone.CheckoutButtons;
import pom.components.checkoutone.CheckoutInfo;

/**
 * {@link CheckoutOnePage} class represents the page containing the page details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link CheckoutInfo} and {@link CheckoutButtons} components.
 */
@Getter // lombok to generate getters
public class CheckoutOnePage extends BasePage {

    private final CheckoutInfo checkoutInfo;
    private final CheckoutButtons checkoutButtons;

    /**
     * Constructs a {@link CheckoutOnePage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public CheckoutOnePage(WebDriver driver) {
        super(driver);
        checkoutInfo = PageFactory.initElements(driver, CheckoutInfo.class);
        checkoutButtons = PageFactory.initElements(driver, CheckoutButtons.class);
    }


    @Override
    public String getUrl() {
        return this.driver.getCurrentUrl();
    }

}
