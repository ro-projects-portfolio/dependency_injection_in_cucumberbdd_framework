package objects;

import lombok.Getter;

/**
 * {@link Product} class represents a product in the context of a web application.
 */
@Getter // Lombok annotation to generate getters
public class Product {
    private String name;


    /**
     * Constructs a {@link  Product} object with the given name.
     *
     * @param name The name of the product.
     */
    public Product(String name) {
        this.name = name;
    }

}
