@Journalentries
Feature: Journal Entries Scenarios

  
  Scenario: Create new journal entries
    Given User needs to Create new journal entry
    When User needs to Save the new journalentry

  Scenario: Journal entry is in draft and post
    When User needs to verify journalentry is in draft
    When User needs to move journal entries to post from draft

  Scenario: Verify the journal entry is posted or not
    And User needs to verify journal entry is posted or not

  Scenario: Edit the journal entry
    And User needs to edit the posted journal entries
    And User needs to check Tax Inclusive

  Scenario: Copy the journal entry
    Then User needs to copy the journal entry
    Then User needs to check No Tax
