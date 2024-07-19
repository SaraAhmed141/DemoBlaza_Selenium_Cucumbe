@Demo_Blaze @Login
Feature: Login Test
#  (Verify that user can Login successfully
  Background:
    Given The user navigates to website

  Scenario Outline: : Positive Login Test with scenario outline and data table
    When The user clicks on login button and enters following credentials
      | username | <user_username> |
      | password | <user_password> |
    Then The user verifies welcome "<user_username>" message
    Examples:
      | user_username | user_password |
      | TESTUser      | Password      |



