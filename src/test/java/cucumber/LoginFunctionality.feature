Feature: Login into account functionality
  Scenario: The user has ability to log into his account via previously registered account with properly data provided
    Given The user is creating an account
    And The user logged out from previously created account
    And The user is logging in his account via his personal data
    Then The user has access to his account again