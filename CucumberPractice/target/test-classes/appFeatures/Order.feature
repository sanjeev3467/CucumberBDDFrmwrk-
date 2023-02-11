@All
Feature: Amazon Order Details


Background:
    Given Navigate to amazon Login page
    When Enter UserName
    When Enter Password
    And Click on Login button
@smoke
  Scenario: Open the Previous Oder Details
    Then Click on Previous Orders link
    Then View Previous Order details
@sanity
  Scenario: Open the Current Oder Details
    Then Click on Current Orders link
    Then View Current Order details
 @prod   
  Scenario: Open the Canceled Oder Details
    Then Click on Canceled Orders link
    Then View Canceled Order details