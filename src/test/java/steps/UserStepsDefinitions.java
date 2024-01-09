package steps;
// Should be no selenium import, means that implementation separated for test layer

import com.github.javafaker.Faker;
import context.TestContext;
import io.cucumber.java.en.Given;
import objects.CheckoutDetails;

/**
 * Mapped into Java methods Gherkin test steps from feature files related to {@link objects.User}.
 */
public class UserStepsDefinitions {

    private final TestContext context; // we need this value to assign and get values to/from container

    /**
     * Constructor for dependency injection.
     *
     * @param context The {@link TestContext} instance for managing shared state across steps.
     */
    public UserStepsDefinitions(TestContext context) { // constructor for dependency injection
        this.context = context;
    }

    @Given("I have my checkout details")
    public void iHaveMyCheckoutDetails() {
        Faker faker = new Faker();
        CheckoutDetails checkoutDetails = CheckoutDetails
                .builder()
                .setFirstName(faker.name().firstName())
                .setLastName(faker.name().lastName())
                .setPostalCode(faker.address().zipCode())
                .build();  // Checkout Details Object creation using builder pattern
        context.checkoutDetails = checkoutDetails;  // Assign variable to container
    }
}
