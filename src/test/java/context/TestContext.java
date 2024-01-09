package context;

import objects.CheckoutDetails;
import org.openqa.selenium.WebDriver;

/**
 * {@link TestContext} class represents the context shared among different steps during the execution of tests.
 * It contains instances of key components that are required to be shared across different steps, such as the
 * {@link WebDriver} etc.
 */
public class TestContext {

    public WebDriver driver;
    public CheckoutDetails checkoutDetails;
}

// It is also help to avoid sharing WebDriver (using WebDriver as an element of thread local instance)
// instance between different test cases and using static variables that very important during parallel execution.
