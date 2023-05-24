@ShoppingCart
Feature: This feature will be used to test the functionality of SwagLabs application

  Background: 
    Given I have launched the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on home page

  Scenario: Validating the products are added in to the Shoppig Cart
    When I click on the Product name as "Sauce Labs Backpack"
    And I  click on Add to cart button
    And I click on Shopping cart button
    Then I validate the item displayed on the cart page
