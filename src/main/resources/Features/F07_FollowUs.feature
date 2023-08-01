@smoke
Feature: F07_followUs | users could open followUs links

  Scenario: user opens facebook link
    #Given user go to Home page
    When user opens facebook link
    Then Facebook Link is opened in new tab

  Scenario: user opens twitter link
    #Given user go to Home page
    When user opens twitter link
    Then Twitter Link is opened in new tab


    #This Scenario will Fail

  Scenario: user opens rss link
    #Given user go to Home page
    When user opens rss link
    Then New-online-store-is-open is opened in new tab

  Scenario: user opens youtube link
    #Given user go to Home page
    When user opens youtube link
    Then youtube Link is opened in new tab