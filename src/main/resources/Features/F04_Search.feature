@smoke
Feature: F04_Search | user could search using product name or using SKU

  Scenario Outline: user could search using product name
    #Given user go to Home page
    When user Search for a product with Name "<product name>"
    And user clicks on Search button
    Then url contains "https://demo.nopcommerce.com/search?q=" and search shows relevant results
    Examples:
      | product name |
      | nike   |
      | laptop |
      | book   |
#      (There's an issue and there are Results displayed not contains the word (book) ! )


  Scenario Outline: user could search using SKU
    #Given user go to Home page
    When user Search for a product with SKU "<SKU>"
    And user clicks on Search button
    Then SKU in product page contains SKU used in search box
    Examples:
      | SKU |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |






