#Author: Azar
@Forgotpassword
Feature: Info-Accouting forgot password


  Scenario: Forgot password scenario
    Given User need to trigger the forgot password link
    Given User need to Reset the password
    Then User need to login using resetted password
