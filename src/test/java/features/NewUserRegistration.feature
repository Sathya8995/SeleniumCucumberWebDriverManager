Feature: Logged In user view
  Scenario: Validate user is able to view after login
    Given User navigates to the login page
    When User clicks on new Registration button
    Then User should be able to view the Registration page
