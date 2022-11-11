@Quotation
Feature: Info-Accouting Sales-Quotation scenario

  Scenario: Sales-Approving a Quotation scenario
    Given User need to navigate to Quotation slide
    Then User need to Approve a Quotation

  Scenario: Sales-Save a Quotation scenario
    And User need to Save a Quotation

  Scenario: Submitting for approval in Quotation page scenario
    Then User need to navigate draft tab and click submit for approval-Quotation page

  Scenario: Approving a Quotation scenario
    And User need to navigate awaiting approval and approve the credit notes-Quotation page

  Scenario: Sending a Quotation to client scenario
    Then User need to navigate send quotation page and send the quotation to client

  Scenario: Sales- Approving an quotation scenario
    Given User need to navigate to Quotation scenario
    Then User need to Approve a Quotation scenario

  Scenario: Copying an quote - quotation page scenario
    And User need to copy as quote

  Scenario: Copying an invoice - quotation page scenario
    And User need to copy as invoice

  Scenario: Copying an Deliveryorder - quotation page scenario
    And User need to copy as Deliveryorder

  Scenario: Sales- Declining a quotation manually as a user
    Given User need to navigate to Quotation scenario2
    Then User need to Decline a Quotation scenario
    And User need to Decline manually
