@Invoice
Feature: Info-Accouting Sales-Invoice scenario

  Scenario: Sales-Invoice scenario
    Given User need to navigate to Invoice slide
    Then User need to Approve a Invoice
    And User need to Save a Invoice
    And User verify invoice in Draft and moved to Awaiting approval
    And User Verify invoice in Awaiting approval

  Scenario: Payment
    And User make a payment for invoice
    And User Edit to new invoice
    And User copy to new invoice

  Scenario: Taxes scenarios
    Given Tax inclusive scenario
    And No Tax scenario
