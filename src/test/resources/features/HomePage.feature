#Home Page
#Validate When user navigate to home page
# title is TEK Insurance UI and create
# Primary Account Button is exist
  Feature: Testing HomePage Title and Primary Account Button Existence
    @US_1
  Scenario: Page Title should be  "TEK Insurance UI" and PrimaryAccount
            Button should be existed in home page.
  Then Validate Application Title is "Tek Insurance UI"
  Then Validate "Primary Account Button" should be existed