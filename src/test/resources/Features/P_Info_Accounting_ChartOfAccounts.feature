@Chartofaccount
Feature: Info-Accounting Chart of Account order scenario

  @LoginCredentials
  Scenario: Chart of account add an account with is payment scenario/Revenue
    Given User need to navigate to add account in chart of accounts page and enter details like account code,account name ,Tax Id..Etc

  Scenario: Edit an added account  with is payment scenario/Revenue
    Given User need to edit an added account in revenue tab and edit the account name and save the edited account

  Scenario: Verify whether the added account shows in Revenue page
    Given User need to verify Revenue page account and delete the revenue account

  Scenario: Chart of account add account  with is payment scenario/Expenses
    Given User need to navigate to add account in chart of accounts page/Expenses

  Scenario: Edit an added account  with is payment scenario/Expenses
    Given User need to edit an added account in expenses tab

  Scenario: Verify whether the added account shows in Expenses page
    Given User need to verify Expenses page account and delete the expenses account

  Scenario: Chart of account add account  with is payment scenario/Assets
    Given User need to navigate to add account in chart of accounts page/Assets

  Scenario: Edit an added account  with is payment scenario/Assets
    Given User need to edit an added account in Assets tab

  Scenario: Verify whether the added account shows in Assets page
    Given User need to verify Assets page account and delete the asset account

  Scenario: Chart of account add account  with is payment scenario/Liability
    Given User need to navigate to add account in chart of accounts page/Liability

  Scenario: Edit an added account  with is payment scenario/Liability
    Given User need to edit an added account in Liability tab

  Scenario: Verify whether the added account shows in Liability page
    Given User need to verify Liability page account and delete the liability account

  Scenario: Chart of account add account  with is payment scenario/Equity
    Given User need to navigate to add account in chart of accounts page/Equity

  Scenario: Edit an added account  with is payment scenario/Equity
    Given User need to edit an added account in Equity tab

  Scenario: Edit a tax and Move a record to archieve/Equity
    Given User need to edit an tax in Equity tab
    Given User need to move a record to archieve in Equity tab

  Scenario: Verify whether the added account shows in Equity page
    Given User need to verify Equity page account and delete the equity account

  Scenario: Verify whether user can able to make payment using created account
    Given User need to Verify added account through making a complete payment in invoice

  Scenario: Create a account in chart of accounts without payment checkbox
    Given User need to navigate to add account scenario2

  Scenario: Add Bank Account
    Given User needs to navigate to Chart of account and click add bank account 
    Then User needs to click add bank account and navigate to banking page and verify whether the page navigated correctly

  Scenario: Add Cash account
    Given User needs to navigate to chart of accounts screen and click add cash account 
    Then User needs to click Add Cash account and navigate to banking page and verify whether the page navigated correctly
