package objects;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * {@link CheckoutDetails} class represents the details required for the checkout process in a web application.
 */
@Getter // Lombok annotation to generate getters
@Setter // Lombok annotation to generate setters
@Builder(setterPrefix = "set") // Lombok's annotation for builder pattern with custom setter prefix
public class CheckoutDetails {

    private String firstName;
    private String lastName;
    private String postalCode;
}
