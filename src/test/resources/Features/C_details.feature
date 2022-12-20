@Details
Feature: Info-Accouting Organization_Details

  Scenario: Updating details by giving ( DisplayName, OrganizationType , LegalName , Line of Business..Etc )
    Given User needs to navigate organization details screen
    And User needs to give Basic information in Organaization details - DisplayName, OrganizationType , LegalName , Line of Business..Etc 
    And User needs to give Address details in organization details - Postal , city ,state , zipcode..Etc
    And User needs to Save recorded information in Details page
