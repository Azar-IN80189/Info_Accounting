@Forgotpassword
Feature: Info-Accouting forgot password

  Scenario: Triggering an Forgot password From login screen
    Given User need to trigger the forgot password link

  Scenario: Navigate to source email provided and resetting the password from the received mail
    Given User need to Reset the password by navigating to mailinator page

  Scenario: Navigating inside using reset credentials
    Given User need to login using resetted password

  Scenario: Log back in as a existing user
    Given User need to login as existing user
