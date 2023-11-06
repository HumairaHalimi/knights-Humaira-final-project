@Smoke
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
    Then Validate Application Title is "Tek Insurance UI"
    And Click on "Create Primary Account"
    #When user enters credentials
      #| omar@tekschool.us | Omar | Halimi | student |
    When user enters "omar@tekschool.us" as email
    When user enters "Omar" as name
    When user enters "Halimi" as lastname
    When user enters "student" as employment status
    And user select  "Male" as Gender
    And user select "Mr." as Title
    And user select "Single" as Marital Status
    And user enters "04/17/2004" as Date Of Birth
    And clicks on Create Account button and navigate to sign up page
    Then validate "omar@tekschool.us" is as enteredEmail


  @US_4

  Scenario: validate error message with same email address

  #And user enters credentials
    #| omar@tekschool.us | Omar | Halimi | student |
    Then Validate Application Title is "Tek Insurance UI"
    And Click on "Create Primary Account"
    When user enters "omar@tekschool.us" as email
    When user enters "Omar" as name
    When user enters "Halimi" as lastname
    When user enters "student" as employment status
    And user select  "Male" as Gender
    And user select "Mr." as Title
    And user select "Single" as Marital Status
    And user enters "04/17/2004" as Date Of Birth
    And clicks on Create Account button and navigate to sign up page

    Then click on home page logo
    And Click on "Create Primary Account"

    When user enters "omar@tekschool.us" as email
    When user enters "Omar" as name
    When user enters "Halimi" as lastname
    When user enters "student" as employment status
    And user select  "Male" as Gender
    And user select "Mr." as Title
    And user select "Single" as Marital Status
    And user enters "04/17/2004" as Date Of Birth
    And clicks on Create Account button and navigate to sign up page
    Then validate error message "Account with email {0}omar@tekschool.us is exist"










