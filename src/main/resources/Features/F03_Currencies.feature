@smoke
Feature: F03_Currencies | User changes the Currency

  Scenario: User can change the Currency to Euro and changed successfully

    #Given user go to Home page
    When user change the currency to Euro
    Then Euro Symbol is shown on the four products displayed in Home page
