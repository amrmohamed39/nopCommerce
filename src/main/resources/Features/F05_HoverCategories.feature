@smoke
Feature: F05_HoverCategories | Click on Main Category or Hover on one of main categories then click on sub category

  Scenario: user could click on different categories
    #Given user go to Home page
    When user select computer category and select sub category from Desktops ,Notebooks and Software
    And user select Main Category Gift Cards without subList
    Then category page title is (equal or contains) the one user get it while selecting category
