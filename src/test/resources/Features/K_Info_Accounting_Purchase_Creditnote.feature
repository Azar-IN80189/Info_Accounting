@Purchase_CreditNotes
Feature: Info-Accouting Purchase-CreditNotes scenario
 
  Scenario: Adding a credit note as draft-Tax Exclusive
    Given User need to navigate to Purchase-CreditNotes slide
    Then User need to Add a credit note
    And User need to Save as draft

  Scenario: Submitting a credit note approval
    Then User need to navigate draft tab and click submit for approval

  Scenario: Approving the approvals from awaiting approvals
    And User need to navigate awaiting approval and approve the credit notes

  Scenario: Approving the approvals from awaiting approvals and adding payment
    Then User need to navigate awaiting payment and approve the payment for specific credit notes

  Scenario: Adding a credit note as approved-Tax Inclusive
    Given User need to navigate to Purchase-CreditNotes slide scenario
    Then User need to Add a credit note scenario
    And User need to Approve the credit notes

  Scenario: Approving the approvals from awaiting approvals and adding payment scenario-II
    Then User need to navigate awaiting payment and approve the payment for specific credit notes notes scenario-II

  Scenario: Adding a credit note as Approved-No tax-scenario
    Given User need to navigate to Purchase-CreditNotes slide no tax scenario
    Then User need to Add a credit note no tax scenario
    And User need to Approve the credit notes no tax scenario

  Scenario: Approving the approvals from awaiting approvals and adding payment scenario-III
    Then User need to navigate awaiting payment and approve the payment for specific credit notes notes scenario-III
