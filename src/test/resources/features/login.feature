Feature: Login

  Background:
    Given I go to login page

  Scenario: Empty login fields
    Then The field Username is empty
    Then The field Password is empty

  Scenario: Error on empty fields
    When I click on Login
    Then Field Username should be with error
    And Field Password should be with error

  Scenario: Login successfully
    When I provide valid credentials and click login button
    Then I should be redirected to inventory page
