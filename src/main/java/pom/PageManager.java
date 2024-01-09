package pom;

import org.openqa.selenium.WebDriver;
import pom.pages.*;


/**
 * {@link PageManager} class serves as a manager for accessing different page objects in a web application.
 * It provides methods to retrieve instances of specific page objects, ensuring a single instance
 * is used throughout the test execution.
 */
public class PageManager {
    private static LoginPage loginPage;
    private static InventoryPage inventoryPage;
    private static CartPage cartPage;
    private static CheckoutOnePage checkoutOnePage;
    private static CheckoutTwoPage checkoutTwoPage;
    private static CheckoutCompletePage checkoutCompletePage;


    /**
     * Retrieves an instance of the {@link LoginPage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link LoginPage}.
     */
    public static LoginPage getLoginPage(WebDriver driver) {
        return loginPage == null ? new LoginPage((driver)) : loginPage; // ternary operator
    }
    /**
     * Retrieves an instance of the {@link InventoryPage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link InventoryPage}.
     */
    public static InventoryPage getInventoryPage(WebDriver driver) {
        return inventoryPage == null ? new InventoryPage((driver)) : inventoryPage;
    }

    /**
     * Retrieves an instance of the {@link CartPage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link CartPage}.
     */
    public static CartPage getCartPage(WebDriver driver) {
        return cartPage == null ? new CartPage((driver)) : cartPage;
    }
    /**
     * Retrieves an instance of the {@link CheckoutOnePage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link CheckoutOnePage}.
     */
    public static CheckoutOnePage getCheckoutOnePage(WebDriver driver) {
        return checkoutOnePage == null ? new CheckoutOnePage((driver)) : checkoutOnePage;
    }
    /**
     * Retrieves an instance of the {@link CheckoutTwoPage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link CheckoutTwoPage}.
     */
    public static CheckoutTwoPage getCheckoutTwoPage(WebDriver driver) {
        return checkoutTwoPage == null ? new CheckoutTwoPage((driver)) : checkoutTwoPage;
    }

    /**
     * Retrieves an instance of the {@link CheckoutCompletePage}, creating one if it doesn't exist.
     *
     * @param driver The {@link WebDriver} instance used for interacting with the web application.
     * @return An instance of the {@link CheckoutCompletePage}.
     */
    public static CheckoutCompletePage getCheckoutCompletePage(WebDriver driver) {
        return checkoutCompletePage == null ? new CheckoutCompletePage((driver)) : checkoutCompletePage;
    }


}
