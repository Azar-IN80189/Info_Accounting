@profile
Feature: Info-Accouting Profile Update scenario

  Scenario: Update user information details
    Given Give all information
    When save the information

  Scenario: Change new password
    Given Give current new and confirm password
    When save new password and login using new password
