@PurchaseOrder
Feature: create Purchase order


  Scenario: Add new purchase order for Tax Exclusive
    Given User needs to give new purchase order details-Contactname,Date,Orderno,etc
    When User needs to save the details and verify its available in draft or not

  Scenario: Purchase order is approved
    When User needs to approve the purchase order and edit and moved to Awaiting approval
    When User needs to approve the item from awaiting approval stage.

  Scenario: Purchase order is edit and delete
    When User needs to edit the approved item
    When User needs to delete the approved item

  Scenario: Purchase order for Tax Inclusive
    Given User needs to give new purchase order details in purchase order with tax inclusive
    When Check purchase order amount with tax

  Scenario: Purchase order for No Tax
    Given User needs to give new purchase order details in purchase order with No tax
    When Check purchase order amount with No tax

  Scenario: Update purchase order
    Given User needs to create new purchase order and approve the order
    When User needs to update the purchase order

  Scenario: Mark as bill
    Given User needs to mark purchase order as bill
    When User needs to approve bill purchase order
