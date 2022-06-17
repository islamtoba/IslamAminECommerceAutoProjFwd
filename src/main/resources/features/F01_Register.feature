Feature: F01_Register | user should able to create new account


  Scenario: user register with valid data

    Given   user navigate to register page
    And     user choose male or female
    When    user enter valid data
    Then    user press on register button
    And     user could register successfully