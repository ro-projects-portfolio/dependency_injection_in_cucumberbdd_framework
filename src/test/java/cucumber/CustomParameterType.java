package cucumber;

import io.cucumber.java.ParameterType;
import objects.Product;

/**
 * {@link CustomParameterType} class defines custom parameter types for Cucumber scenarios.
 */
public class CustomParameterType {

    // With Dependency Injection, all custom parameter types or data table types provided by Cucumber can be stored in separate classes.
    // If an annotation is used, without dependency injection, it must be provided in the step classes where it is used each time

    // It helps avoid code duplication and reduce lines of code

    /**
     * Custom parameter type for creating {@link Product} objects.
     *
     * @param name The name of the product obtained from the scenario input.
     * @return A new {@link Product} object with the specified name.
     */
    @ParameterType(".*") // Regex to apply for all
    public Product product(String name) {
        return new Product(name.replace("\"", "")); // remove extra quotes from name
    }


}
