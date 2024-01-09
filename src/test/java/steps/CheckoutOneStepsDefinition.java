package steps;
// Should be no selenium import, means that implementation separated for test layer

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pom.PageManager;
import pom.pages.CheckoutOnePage;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link CheckoutOnePage}.
 */
public class CheckoutOneStepsDefinition {
    private final TestContext context; // we need this value to assign and get values to/from container
    private final CheckoutOnePage checkoutOnePage;

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public CheckoutOneStepsDefinition(TestContext context) { // constructor for dependency injection
        this.context = context;
        this.checkoutOnePage = PageManager.getCheckoutOnePage(context.driver); // assign page using copy of driver from DI container
    }

    @When("I provide my billing details")
    public void iProvideMyBillingDetails() {
        this.checkoutOnePage
                .getCheckoutInfo()
                .enterCheckoutDetails(context.checkoutDetails); // get details from container
    }

    @And("I click continue button")
    public void iClickContinueButton() {
        this.checkoutOnePage
                .getCheckoutButtons()
                .clickContinueBtn();
    }

}
