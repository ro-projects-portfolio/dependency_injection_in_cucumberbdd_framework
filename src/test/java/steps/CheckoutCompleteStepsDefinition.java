package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import pom.PageManager;
import pom.pages.CheckoutCompletePage;

import static org.junit.Assert.assertTrue;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link CheckoutCompletePage}.
 */
public class CheckoutCompleteStepsDefinition {

    private final CheckoutCompletePage checkoutCompletePage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public CheckoutCompleteStepsDefinition(TestContext context) { // constructor for dependency injection
        this.checkoutCompletePage = PageManager.getCheckoutCompletePage(context.driver); // assign page using copy of driver from DI container
    }

    @Then("I should see a successful order header")
    public void iShouldSeeASuccessfulOrderHeader() {
        assertTrue(
                this.checkoutCompletePage.getCheckoutCompleteContainer().isSuccessMsgDisplayed()
        );
    }
}
