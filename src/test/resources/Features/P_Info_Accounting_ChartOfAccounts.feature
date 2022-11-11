@Chartofaccount
Feature: Info-Accouting Chart of Account order scenario

@Login
  Scenario: Chart of account add account  with is payment scenario/Revenue
    Given User need to navigate to add account scenario
   
  Scenario: Verify whether the added account shows in Revenue page
    Given User need to verify Revenue page account

  Scenario: Chart of account add account  with is payment scenario/Expenses
    Given User need to navigate to add account scenario/Expenses

  Scenario: Verify whether the added account shows in Expenses page
    Given User need to verify Expenses page account

  Scenario: Chart of account add account  with is payment scenario/Assets
    Given User need to navigate to add account scenario/Assets

  Scenario: Verify whether the added account shows in Assets page
    Given User need to verify Assets page account

  Scenario: Chart of account add account  with is payment scenario/Liability
    Given User need to navigate to add account scenario/Liability

 Scenario: Verify whether the added account shows in Liability page
    Given User need to verify Liability page account

  Scenario: Chart of account add account  with is payment scenario/Equity
   Given User need to navigate to add account scenario/Equity

  Scenario: Verify whether the added account shows in Equity page
    Given User need to verify Equity page account

  Scenario: Verify added account by making a payment for an invoice
   Then User need to Verify added account

  #Scenario: Chart of account add account  with - is payment scenario
   # Given User need to navigate to add account scenario2

#  Scenario: Verify by creating a new quotation using created account
   # Then User need to Verify added account2

  #Scenario: Chart of account add bank account
   # Given User need to navigate to add bank account

  #Scenario: Verify whether the added bank account is displaying
   # Then User need to Verify added bank account

 # Scenario: Import a Chart of Account
  #  Given User need to navigate to Import page
   # Then User need to Upload the file and import a account
