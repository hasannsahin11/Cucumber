Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password
    And Click on Login Button
    Then User should login successfully

  Scenario Outline: Create an Entrance Exam
    Given Go to Entrance Exams page
    And Click on add button
    And Fill the Create Exam form
    |<Exam Name>|
    And Create a description
    |<Description>|
    And Create a note
    |<Note>|
    When Click on save button
    Then Success message should be displayed

    Examples:
      | Exam Name       | Description              | Note               |
      | Biatch 7 Exam 1 | Biatch 7 is the best     | We are coming son! |
      | Biatch 7 Exam 2 | Biatch 7 about to getcha | We are coming son! |
      | Biatch 7 Exam 3 | Biatch 7  hangs in there | We are coming son! |
      | Biatch 7 Exam 4 | Biatch 7 don't give up   | We are coming son! |
      | Biatch 7 Exam 5 | Biatch 7 is almost there | We are coming son! |

