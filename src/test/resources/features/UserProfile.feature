@Smoke
Feature: Testing user profile functionalities

  Background:
    When  Navigate to Login Button and click
    When  enter username as "supervisor"
    And  enter password as "tek_supervisor"
    And Navigate to Sign in button and click
    Then  click on profile button

  @US_7
  Scenario: validating user information in customer service portal
    And validate "Active" is correct
    And validate "CSR" is ok
    And Validate "Supervisor" is entered right
    And validate "supervisor" is fine
    And validate "admin" is as expected

  @US_8
 Scenario: validating Logout button to be enabled

    And validate "logout button" is enabled
    And click on "logout button"
