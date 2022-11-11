@Bills
Feature: Create new Bill

  Scenario: Create New Bill order
    Given New Bill order list
    When Verify order is in Draft

  Scenario: Bill is need to approved
    When Bill is moved to awaiting payment and approve the bill

  Scenario: Make payment
    When Make the bill payment

  Scenario: Update bill
    When update the bill

  Scenario: Create new bill for Tax inclusive
    Given New bill order for Tax inclusive
    When verify bill is approved or not

  Scenario: Create new bill for No Tax
    Given New bill order for No Tax
    When verify No tax bill is approved or not

    
    
    
    
    