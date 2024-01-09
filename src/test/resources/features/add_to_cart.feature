Feature: Add to cart

  Background:
    Given I go to login page
    And I provide valid credentials and click login button

  Scenario: Add one quantity from Inventory page abd check cart badge
    When I add a "Sauce Labs Bolt T-Shirt" to the cart
    Then I should see 1 in the cart badge

  Scenario Outline: Add one quantity from Inventory page - all products
    When I add a "<product_name>" to the cart
    And I click cart link
    Then I should see 1 "<product_name>" in the cart
    Examples:
      | product_name            |
      | Sauce Labs Bolt T-Shirt |
 #     | Sauce Labs Backpack      |
 #     | Sauce Labs Bike Light    |
 #     | Sauce Labs Fleece Jacket |
 #     | Sauce Labs Onesie       |
