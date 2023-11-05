@Smoke
Feature: Validate Login Elements

  Background:

    When Navigate to Login Button and click
    Then Validate the login page title as "Sign in to your Account"

  @US_5
  Scenario:Verify logging in successfully
    When  enter username as "supervisor"
    And  enter password as "tek_supervisor"
    And Navigate to Sign in button and click
    Then Validate the signed in portal title as "Customer Service Portal"

  @US_6
  Scenario Outline: validating error message by wrong username or password
    When  enter username as "<username>"
    When enter password as "<password>"
    And Navigate to Sign in button and click
    Then Validate error message as "<error message>"
    Examples:
      | username      | password       | error message                 |
      | supervisor    | wrongPassword  | Password not matched          |
      | wrongUserName | tek_supervisor | User wrongUserName not found |


