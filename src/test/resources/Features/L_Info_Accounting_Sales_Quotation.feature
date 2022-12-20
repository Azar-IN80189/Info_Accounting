@Quotation
Feature: Info-Accouting Sales-Quotation scenario


 Scenario: Creating a new quotation and approving the quotation
    Given User need to navigate to Quotation slide
    And User need to create and Approve a Quotation by entering details like Customer contact,Date,Expiry date..Etc

  Scenario: Sending approved quotation to client
    Then User need to send the quotation to client

  Scenario: Verifying whether the sent quotation is properly recieved by the client
    And User need to check whether the quotation is recieved in client mail address

  Scenario: Client is accepting the quotation from the recieved quoation mail
    And User need to accept the quotation and navigate back to info accounting home screen

  Scenario: Accepted quotation need to be invoiced by the user end
    And User need to mark the quotation invoice as invoiced

  Scenario: Sales-Save a Quotation
    Given User need to Save a Quotation as draft

  Scenario: Submitting for approval in Quotation page
    Then User need to navigate draft tab and click submit for approval-Quotation page

  Scenario: Approving a Quotation
    And User need to navigate awaiting approval and approve the credit notes-Quotation page

  Scenario: Sending a Quotation to client from approver tab
    Then User need to navigate send quotation page and send the quotation to client

  Scenario: Sales- Approving a quotation
    Given User need to navigate to Quotation scenario
    Then User need to Approve a Quotation scenario

  Scenario: Copying a quote
    And User need to copy as quote

  Scenario: Copying a invoice
    And User need to copy as invoice

  Scenario: Copying a Deliveryorder
    And User need to copy as Deliveryorder

  Scenario: Sales- Declining a quotation manually as a user
    Given User need to navigate to Quotation screen
    Then User need to create a approved quotation
    And User need to Decline the quotation manually

  Scenario: Sales- Accepting a quotation manually as a user
    Given User need to navigate to Quotation screen/Accept_Scenario
    Then User need to create a approved quotation/Accept_Scenario
    Then User need to approve the quotation manually/Accept_Scenario
