@Sales_Invoice
Feature: Info-Accouting Sales-Invoice scenario

  Scenario: Sales-Invoice scenario
    Given User needs to navigate to Invoice slide
    Then User needs to Approve a Invoice

  Scenario: Send Invoice
    Given User needs to check send invoice scenario

  Scenario: Add new invoice for Tax Exclusive
    And User needs to give new invoice details- To,Date,Invoiceno,etc..
    And User needs to save the new invoice details

  Scenario: Invoice need to approve
    And User verify invoice in Draft and moved to Awaiting approval
    And User Verify invoice in Awaiting approval

  Scenario: Payment for invoice
    And User needs to make a payment for invoice

  Scenario: Edit,copy,void the invoice
    And User needs to Edit the approved invoice
    And User needs to copy the approved invoice

  Scenario: Add new invoice for Tax inclusive
    Given User needs to give new invoice details for tax inclusive
    And user needs to void the approved invoice

  Scenario: Add new invoice for No Tax
    Given User needs to give new invoice details for No Tax
    And User needs to add credit note for invoice
