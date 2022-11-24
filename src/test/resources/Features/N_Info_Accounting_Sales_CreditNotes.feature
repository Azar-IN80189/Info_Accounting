@CreditNotessales
Feature: Info-Accouting Sales-Credit Note scenario

  Scenario: Sales-Credit Note scenario
    Given User need to navigate to Credit Note slide
    Then User need to Approve a Credit Note
    And User need to Save a Credit Note

  Scenario: Sales-Credit Notes SubmitApprove tax inclusive-scenario
    Given User need to navigate to Sales-Credit Notes slide scenario
    Then User need to Add a Sales-Credit note scenario
    And User need to Approve the Sales-Credit notes

  Scenario: Sales-Credit Notes SubmitApprove no tax-scenario
    Given User need to navigate to Sales-Credit slide no tax scenario
    Then User need to Add a Sales-Credit note no tax scenario
    And User need to Approve the Sales-Credit notes no tax scenario
