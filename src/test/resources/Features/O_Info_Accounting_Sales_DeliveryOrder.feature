#Author: Azar
@Deliveryorder
Feature: Info-Accouting Sales-Delivery order scenario

  Scenario: Sales Approved-Delivery order scenario
    Given User need to navigate to Delivery order page
    Then User need to Approve a Delivery order

  Scenario: Sending an approved delivery order
    Then User need to send approved delivery order

  Scenario: copying an delivery order
    Then User need to copy as quote in delivery order page

  Scenario: mark as packed in delivery order
    Then User need to mark as packed in delivery order page

  Scenario: mark as delivered in delivery order
    Then User need to mark as delivered in delivery order page

  Scenario: mark as Invoiced in delivery order
    Then User need to mark as Invoiced 

  Scenario: marking the order as void in delivery order
    Then User need to void the delivery order

  Scenario: Sales Save-Delivery order scenario
    And User need to Save a Delivery order

  Scenario: Submitting for Approval scenario
    Then User need to navigate draft tab and click submit for approval-Delivery order page

  Scenario: Approving the delivery order scenario
    Then User need to navigate awaiting approval tab and approve the delivery order

  Scenario: copying as quote for delivery order scenario-II
    Then User need to copy as quote-In Delivery order scenario-II

  Scenario: Mark as packed for delivery order scenario-II
    Then User need to mark as packed scenario-II

  Scenario: Mark as delivered for delivery order scenario-II
    Then User need to mark as delivered scenario-II

  Scenario: Mark as Invoiced for delivery order scenario-II
    Then User need to mark as Invoiced scenario-II

  Scenario: Mark as void for delivery order scenario-II
    Then User need to void the delivery order scenario-II

  Scenario: Sales-Multiple Approved order scenario
    Given User need to navigate to Multiple Delivery order scenario
    Then User need to Approve a Multiple Delivery order

  Scenario: Sales-Multiple submit for approval in delivery order scenario
    Then User need to navigate draft tab and click submit for approval-Delivery order page scenario-II

  Scenario: Sales-Multiple approve from awaiting approval in delivery order scenario-II
    Then User need to navigate awaiting approval tab and approve the delivery order scenario-II

  Scenario: Verify print operations -delivery order scenario-II
    Then User need to verify print button

  Scenario: copying as quote for delivery order scenario-III
    Then User need to copy as quote-In Delivery order scenario-III

  Scenario: copying as Invoice for delivery order scenario-III
    Then User need to copy as Invoice-In Delivery order scenario-III

  Scenario: copying as Deliveryorder for delivery order scenario-III
    Then User need to copy as Deliveryorder-In Delivery order scenario-III

  Scenario: Mark as packed for delivery order scenario-III
    Then User need to mark as packed scenario-III

  Scenario: Mark as delivered for delivery order scenario-III
    Then User need to mark as delivered scenario-III

  Scenario: Mark as Invoiced for delivery order scenario-III
    Then User need to mark as Invoiced scenario-III

  Scenario: Mark as void for delivery order scenario-III
    Then User need to void the delivery order scenario-III

  Scenario: Saving multiple quotation as draft - delivery order scenario
    And User need to Save a Multiple Delivery order

  Scenario: delete multiple saved draft quotation- delivery order scenario
    Then User need to delete Multiple Delivery order
