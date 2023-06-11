Feature: CitizenshipFunctionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario Outline: Create a Citizenship
    Given Navigate to Citizenships page
    And Click on add button
    And Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
    When Click on save button
    Then Success message should be displayed

    Examples:
      | CitizenshipName | CitizenshipShortName |
      | HSN1            | hs1                  |
      | HSN2            | hs2                  |
      | HSN3            | hs3                  |
      | HSN4            | hs4                  |

  Scenario Outline: Delete Citizenship
    Given Navigate to Citizenships page
    And Search for Citizenship with name as "<CitizenshipName>" and short name as "<CitizenshipShortName>"
    And Delete citizenship
    Then Success message should be displayed
    Examples:
      | CitizenshipName | CitizenshipShortName |
      | HSN1            | hs1                  |
      | HSN2            | hs2                  |
      | HSN3            | hs3                  |
      | HSN4            | hs4                  |