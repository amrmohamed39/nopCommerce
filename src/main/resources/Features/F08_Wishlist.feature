@smoke
Feature: F08_Wishlist | This Feature to test WishList

  Scenario: Add a product to the wishlist
    #Given user go to Home page
    When  user clicks on wishlist button on a product
    Then get a msg That product added to the wishlist successfully


  Scenario: Add a product to the wishlist and verify that Quantity greater than Zero
    #Given user go to Home page
    When  user clicks on wishlist button on a product
    And  user clicks on wishlist Tab
    Then the product added to the wishlist and Quantity greater than zero







