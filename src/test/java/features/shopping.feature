Feature: Shopping page scenarios
Background:
  Given user is on the shopping page


  Scenario: User adds four items to shopping cart
    When user adds "Pebble Rebel" to the bag
    And user adds "Jadey Business" to the bag
    And user clicks on "Shopping Bag" button
    And user returns to the shopping page
    And user adds "Game of Stones" to the bag
    And user clicks on "Shopping Bag" button
    And user clicks on "Checkout" button
    And user clicks on "Continue as Guest" button
    And user inputs zipcode
    Then user should see a list of stylists


