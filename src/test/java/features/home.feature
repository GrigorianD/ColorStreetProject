Feature: Home page scenarios

Scenario: User successfully gets redirected to a shopping window
  Given user successfully navigates to homepage
  When user selects preferred country and language
  And user navigates to the fourth sliding window
  When user clicks on Shop Now button
  Then user should see a sale banner
