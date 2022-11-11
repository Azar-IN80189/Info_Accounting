Feature: create Purchase order

  Scenario: create purchase order and save as draft
    Given Give contact details and save the contacts
    When the contact is available in draft or not

  Scenario: Add new purchase order
    Given Give all information in new purchase order
    When The purchase order is displayed in draft list
    When The purchase order is edit and moved to Awaiting approval
    When The item is approved from awaiting approval stage.
    When item is able to edit
    When item is able to delete

  Scenario: Purchase order for Tax Inclusive
    Given Give all information in purchase order with tax inclusive
    When Check purchase order amount with tax

  Scenario: Purchase order for No Tax
    Given Give all information in purchase order with No tax
    When Check purchase order amount with No tax

  Scenario: Update purchase order
    Given Create new purchase order and approve the order
    When Update the purchase order

  @Purchaseorder
  Scenario: Mark as bill
    Given Mark purchase order as bill
    When Approve bill purchase order
    When Unmark purchase order bill
