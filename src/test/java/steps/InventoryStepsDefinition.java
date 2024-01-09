package steps;
// Should be no selenium import, means that implementation separated for test layer

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Product;
import pom.PageManager;
import pom.pages.InventoryPage;
import utils.ConfigurationFileReader;

import static org.junit.Assert.assertEquals;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link InventoryPage}.
 */
public class InventoryStepsDefinition {
    private final InventoryPage inventoryPage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public InventoryStepsDefinition(TestContext context) { // constructor for dependency injection
        this.inventoryPage = PageManager.getInventoryPage(context.driver); // assign page using copy of driver from DI containe
    }

    @Then("I should be redirected to inventory page")
    public void iShouldBeRedirectedToInventoryPage() {
        assertEquals(
                "User are not redirected to inventory page",
                ConfigurationFileReader.getInstance().getInventoryUri(),
                inventoryPage.getUrl()
        );
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product prod) {
        this.inventoryPage
                .getInventoryContainer()
                .addToCart(prod.getName());
    }

    @Then("I should see {int} in the cart badge")
    public void iShouldSeeInTheCartBadge(int expectedNumber) {
        assertEquals(
                expectedNumber,
                this.inventoryPage.getHeader().getCartBadgeQuantity()
        );
    }

    @And("I click cart link")
    public void iClickCartLink() {
        this.inventoryPage
                .getHeader()
                .clickCartLink();
    }
}
