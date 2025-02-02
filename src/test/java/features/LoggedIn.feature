Feature: Logged In user view
  Scenario: Validate user is able to view after login
    Given User navigates to the login page
    When User successfully enters the log in details
    Then user should be able to view the product category page
