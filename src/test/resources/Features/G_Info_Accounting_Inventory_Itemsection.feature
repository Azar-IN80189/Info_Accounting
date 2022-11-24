@InventoryItems
Feature: Info-Accouting Inventory-Items
@Login
  Scenario: Adding an Item in inventory
    Given User need to navigate to Item slide
    And User need to Add an item

  Scenario: Deleting an Item in inventory
    And User need to delete an item

  Scenario: Adding an Service item in inventory
    Then User need to add an service item

  Scenario: Deleting an Service item in inventory
    And User need to delete an service item

  Scenario: Adding an product item in inventory
    And User need to add an product group

  Scenario: Deleting an product item in inventory
    And User need to delete an product group item

  Scenario: Manage category item and adding an  new category item
    And User need to Manage an item

  Scenario: Manage Unit type item and adding an unit item
    Then User need to Manage a unit type

  Scenario: Verify all the headers in Inventory-Items page
    Then User need to verify the All Headers on the Items page
