Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Given User should login successfully

  Scenario: Create A Fee
    Given Navigate to Fee Page
    And Click on add button
    And Fill the add fee form
      | Batch 777   |
      | c7          |
      | bt7         |
      | 777         |
    When Click on save button
    Then Success message should be displayed

    Scenario: Delete Fee
      Given Navigate to Fee Page
      When Search for the Fee
        | Batch 777   |
        | c7          |
        | 777         |
      And Delete Fee
      Then Success message should be displayed
