Feature: Work on Flipcart

  @searchItem
  Scenario: To search the item into Search box
    Given Browser should be open
    And User should be on flipcart Homepage
    When User enter the Mobile name in the Search box
    And Click on search icon
    Then Searched mobiles should be shown
