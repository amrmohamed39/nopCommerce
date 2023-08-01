@smoke
Feature:  F01_Register | users could register with new accounts

  Scenario: Guest user could register with valid data successfully

    Given User go to Registration Page
    When user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter email "amrtest99@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And Clicks on Register Button
    Then User registered Successfully


  Scenario: Registered user can't register with the same email again

    Given User go to Registration Page
    When user select gender type
    And user enter first name "automation" and last name "tester"
    And user enter date of birth
    And user enter email "amrtest99@example.com" field
    And user fills Password fields "P@ssw0rd" "P@ssw0rd"
    And Clicks on Register Button
    Then user can't register with same email


