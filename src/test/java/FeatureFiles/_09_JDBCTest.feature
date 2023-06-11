Feature: Testing Data Base

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario: States testing with JDBC
    Given Navigate to States Page
    When Send the query to the "select * from country"
    Then Check if they match with UI

