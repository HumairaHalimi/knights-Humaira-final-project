
Feature: Creating Account Functions

  @US_2
  Scenario: after navigating to home page and clicking
  on "Create Primary Account", user should be navigated to
  Create Account form and form title be visible as expected.

    Then Validate Application Title is "Tek Insurance UI"
    Then Validate "Create Primary Account" should be existed
    And Click on "Create Primary Account"
    Then Validate Form Title is "Create Primary Account Holder"

  @US_3
  Scenario:Successful Primary Account creation
    When Click on "Create Primary Account"
    And Validate Form Title is "Create Primary Account Holder"
    When user enters credentials
      | omar@tekschool.us | Omar | Halimi | student |
    And user select  "Male" as Gender
    And user select "Mr." as Title
    And user select "Single" as Marital Status
    And user enters "04/17/2004" as Date Of Birth
    And clicks on Create Account button and navigate to sign up page
    Then validate "omar@tekschool.us"is as expected
@US_4

Scenario: validate error message using wrong username or password
  When Click on "Create Primary Account"
  And user enters credentials
    | omar@tekschool.us | Omar | Halimi | student |
  And user select  "Male" as Gender
  And user select "Mr." as Title
  And user select "Single" as Marital Status
  And user enters "04/17/2004" as Date Of Birth
  And clicks on Create Account button and navigate to sign up page
  Then validate error message "Account with email omar@tekschool.us is exist"










