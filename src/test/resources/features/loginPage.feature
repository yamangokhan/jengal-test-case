Feature: Web Admin Pannel Login Process

  Background: Common Steps that User Goes The URL
    Given the user goes to the "URL"
    When the user clicks register button on homepage

@jengal
  Scenario: Positive Test Case User Login Page
    When the user enters valid name to name input area
    Then the user enters valid email to email input area
    And the user enters valid password to password input area
    And the user confirms valid password
    And the user clicks privacy policy checkbox
    And the user clicks register button
    And the user handles captcha
    And the user verifies that succesfull login to the page

  Scenario Outline: Name Input Area Testing
    When the user enters "<invalid name>" to name input area
    Then the user enters valid email to email input area
    And the user enters valid password to password input area
    And the user confirms valid password
    And the user clicks privacy policy checkbox
    And the user clicks register button
    And the user verifies that error message for name input is displayed

    Examples:
      | invalid name |
      |              |

  Scenario Outline: Email Input Area Testing
    When the user enters valid to name input area
    Then the user enters "<invalid email>" to email input area
    And the user enters valid password to password input area
    And the user confirms password
    And the user clicks privacy policy checkbox
    And the user clicks register button
    And  the user verifies that error message is displayed

    Examples:
      | invalid email      |
      | asdasd             |
      | @asd@ads.gmail.com |
      | 1                  |
      | a                  |
      | .,!'               |
      | Şaşkın@gmail.com   |
      | Çiçek@gmail.com    |
      | Üzüm@gmail.com     |
      | ğşğğşğş@gmail.com  |
      | İnsan@hot.c        |


  Scenario Outline: Password Input Area Testing
    When the user enters valid to name input area
    Then the user enters valid email to email input area
    And the user enters "<invalid password>" to password input area
    And the user confirms password
    And the user clicks privacy policy checkbox
    And the user clicks register button
    And  the user verifies that error message for password input is displayed

    Examples:
      | invalid password |
      | 1                |
      | asd              |
      | 123asd           |
      | asd 123          |
      | !335_;           |


  Scenario Outline: Confirm Password Input Area Testing
    When the user enters valid to name input area
    Then the user enters valid email to email input area
    And the user enters "<new valid password>" to password input area
    And the user enters "<different password>" to confirm input area
    And the user clicks privacy policy checkbox
    And the user clicks register button
    And the user verifies that error message for confirm password input is displayed
    Examples:
      | new valid password | different password |
      | 123456Cz           | 654321Cz           |


    Scenario: Testing Mandatory Fields
      When the user clicks name input area
      Then the user clicks email input area
      And the user clicks password input area
      And the user clicks confirm password input area
      And the user clicks privacy policy checkbox
      And the user clicks register button
      And the user verifies that empty error messages are displayed
