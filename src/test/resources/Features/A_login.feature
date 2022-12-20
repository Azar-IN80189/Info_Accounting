@Loginscenario
Feature: Verify Info-Accouting Login Feature

  Scenario: Login using Support User Credentials
    Given User need to enter Username and password and logged in as Support User
    And User need to check whether it is logged in as support user

  Scenario: Login using Normal User Credentails
    Given User need to enter Username and password and logged in as Normal User
    And User need to check whether it is logged in as Normal user
