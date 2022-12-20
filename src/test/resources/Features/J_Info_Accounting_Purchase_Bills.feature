@Bills
Feature: Create new Bill Approve,Edit,Delete and update the bill


  Scenario: Add new Purchase Bill for Tax Exclusive
    Given User needs to give new Bill details- Contact,Date,Currency etc
    When User needs to check the Bill is in draft and move to waiting for approval

  Scenario: Bill is need to approved
    When User needs to verify the Bill is in Awaiting approval
    And User needs to Approve the bill

  Scenario: Make the payment for Bills
    When User needs to Make the payment for bills

  Scenario: Bill is need to update
    When User needs to Update the Bill

  Scenario: Create new bill for Tax inclusive
    Given User needs to create new bill order for Tax inclusive
    When verify bill is approved or not

  Scenario: Create new bill for No Tax
    Given User needs to create new bill order for No Tax
    When verify bill is approved or not

  Scenario: Bill is Edit and void
    Given User needs to Create new Bill and approve it
    Then User needs to edit the approved bill
    Then User needs to void the approved bill

  Scenario: Copy and add credit note for the Bill
    Given User needs to copy the bill
    Then User needs to approve the copied bill
    Then User needs to add credit note for approved bill
