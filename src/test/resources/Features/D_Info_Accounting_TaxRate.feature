@TaxRate
Feature: Info-Accouting Tax Rate scenario

  Scenario: Adding a new tax rate by Entering ( Tax Rate Display Name, Tax Code ,Box Of Number...Etc )
    Given User need to navigate tax rates section
    And User need to create a new tax rate

  Scenario: Edit an Tax Rate by Editing & Changing the component name and removing a added new component column
    Given User need to edit the tax rate and save the edited tax rate

  Scenario: Deleting a newly added tax rate 
    Given User need to Delete the tax rate which is newly created
