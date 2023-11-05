Feature:Testing Accounts Page Functionalities

  Background:
    When Navigate to Login Button and click
    When enter username as "supervisor"
    And  enter password as "tek_supervisor"
    And  Navigate to Sign in button and click
    When Click on "Accounts" Link

  @US_11
  Scenario: validate account table rows

    Then Validate accounts table have 5 rows

  @US_12
  Scenario: Validate Change Item per page

    Then Validate accounts table have 5 rows
    When change item per page to "10"
      Then Validate accounts table have 10 rows
      When change item per page to "25"
      Then Validate accounts table have 25 rows
      When change item per page to "50"
      Then Validate accounts table have 50 rows