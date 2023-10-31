
Feature: Creating Account Functions

  @US_2
  Scenario: after navigating to home page and clicking
  on "Create Primary Account", user should be navigated to
  Create Account form and form title be visible as expected.

    Then Validate Application Title is "Tek Insurance UI"
    Then Validate "Primary Account Button" should be existed
    And Click on "Primary Account Button"
    Then Validate Form Title is "Create Primary Account Holder"

  @US_3
  Scenario:Successful Primary Account creation
    When Click on "Primary Account Button"
    And Validate Form Title is "Create Primary Account Holder"
    When user enters credentials
      | omarJanemm@tekschool.us | Omar | Halimi | student |
    And user select  "Male" as Gender
    And user select "Mr." as Title
    And user select "Single" as Marital Status
    And user enters "04/17/2004" as Date Of Birth
    And clicks on Create Account button and navigate to sign up page
    Then validate "omarJanemm@tekschool.us"is as expected









