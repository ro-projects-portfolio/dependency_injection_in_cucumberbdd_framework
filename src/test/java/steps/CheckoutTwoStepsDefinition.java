package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import pom.PageManager;
import pom.pages.CheckoutTwoPage;
/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link CheckoutTwoPage}.
 */
public class CheckoutTwoStepsDefinition {

    private final CheckoutTwoPage checkoutTwoPage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public CheckoutTwoStepsDefinition(TestContext context) { // constructor for dependency injection
        this.checkoutTwoPage = PageManager.getCheckoutTwoPage(context.driver); // assign page using copy of driver from DI container
    }

    @And("I click finish button")
    public void iClickFinishButton() {
        this.checkoutTwoPage
                .getCheckoutTwoFooter()
                .clickFinishBtn();
    }
}
