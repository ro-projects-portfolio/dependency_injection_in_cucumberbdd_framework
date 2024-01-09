package steps;
// Should be no selenium import, means that implementation separated for test layer

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import objects.Product;
import pom.PageManager;
import pom.pages.CartPage;

import static org.junit.Assert.assertEquals;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link CartPage}.
 */
public class CartStepsDefinition {
    private final CartPage cartPage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public CartStepsDefinition(TestContext context) { // constructor for dependency injection
        this.cartPage = PageManager.getCartPage(context.driver); // assign page using copy of driver from DI container
    }

    @Then("I should see {int} {product} in the cart")
    public void iShouldSeeInTheCart(int expectedQuantity, Product prod) {
        assertEquals(
                expectedQuantity,
                this.cartPage.getCartList().getProductQuantity(prod.getName())
        );
    }

    @Given("I click checkout button")
    public void iClickCheckoutButton() {
        this.cartPage
                .getCartFooter()
                .clickCheckoutBtn();
    }
}
