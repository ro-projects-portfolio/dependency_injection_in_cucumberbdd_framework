package pom.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.components.cart.CartFooter;
import pom.components.cart.CartList;

/**
 * {@link CartPage} class represents the page containing the cart details in a web application.
 * It extends the {@link BasePage} class and provides access to the {@link CartList} and {@link CartFooter} components.
 */
@Getter // lombok to generate getters
public class CartPage extends BasePage {
    private final CartList cartList;
    private final CartFooter cartFooter;

    /**
     * Constructs a {@link CartPage} object with the given {@link WebDriver} instance.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     */
    public CartPage(WebDriver driver) {
        super(driver);
        this.cartList = PageFactory.initElements(driver, CartList.class); // initialize CartList component
        this.cartFooter = PageFactory.initElements(driver,CartFooter.class); // initialize CartFooter component
    }

    @Override
    public String getUrl() {
        return driver.getCurrentUrl();
    }

}
