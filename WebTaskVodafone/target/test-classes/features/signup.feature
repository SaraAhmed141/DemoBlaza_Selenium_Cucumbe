@Demo_Blaze @SignUp
Feature: Signup Test

  # Verify that user can Signup successfully
  Background:
    Given The user navigates to website

  Scenario Outline: <Title>
    When The user clicks on signup button and enters "<username>" "<password>" details
    Then The user verifies Success message "<message>"
    Examples:
      | Title                                        | username        | password        | message                                |
      | user can Signup successfully with valid data | NEWTESTUser_154 | NEWPassword123  | Sign up successful.                    |
      | user Signup with missing data                |                 | Password        | Please fill out Username and Password. |
      | user Signup with exist data                  | NEWTESTUser_133 | NEWPassword123  | This user already exist.               |
      | user Signup with empty field                 |                 |                 | Please fill out Username and Password. |
      | user Signup with missing data                |                 | Passwordinvalid | Please fill out Username and Password. |


