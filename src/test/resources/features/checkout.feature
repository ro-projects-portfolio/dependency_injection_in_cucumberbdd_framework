Feature: Place Order

  # This case should be changed (use it just for example) because there are too many preconditions and they are covered by Selenium (bad practice)
  # Instead of Selenium need to use API (cover preconditions using cookies)
  Scenario: Successful order placement
    Given I go to login page
    * I provide valid credentials and click login button
    * I have my checkout details
    * I add a "Sauce Labs Bolt T-Shirt" to the cart
    * I click cart link
    * I click checkout button
    When I provide my billing details
    And I click continue button
    And I click finish button
    Then I should see a successful order header
