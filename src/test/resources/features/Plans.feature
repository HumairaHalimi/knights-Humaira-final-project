@Smoke
Feature:Testing Plans Page functions.

  Background:
    When Navigate to Login Button and click
    When enter username as "supervisor"
    And  enter password as "tek_supervisor"
    And Navigate to Sign in button and click
    Then click on Plans button

  @US_9
  Scenario: Validating presence of 4 rows data in plan page
    Then Validate 4 row of data is present

  @US_10
  Scenario:Validating time accuracy in date table
  Then Validate DATE CREATED is November 4, 2023
  And Validate DATE EXPIRE is November 5, 2023
















