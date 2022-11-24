@profile
Feature: Info-Accouting Profile Update scenario

  Scenario: Updating a profile by giving all the new details like ( Basic Information, Contact Details, Preferences..Etc)
    Given User needs to give all the information like - Basic Information, Contact Details , Preferences..Etc
    And User needs to update/save basic information

  Scenario: Changing a new password from profile screen > Preferences
    Given User need to give credentials to change the password - current password, new password and confirm password..Etc
    And User need to save the newly changed password and login with new password with the same user