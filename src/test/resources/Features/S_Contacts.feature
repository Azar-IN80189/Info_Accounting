@Contactspage
Feature: Info-Accounting Contacts page scenario

  @LoginCredentials
  Scenario: Create a contact for customer
    Given User need to navigate to add an contact for customer in contact page
    Then Enter details like ContactName,CompanyName,AccountNumber..Etc in Contact details section
    And Navigate to Address tab and enter details like Attention,PostalAddress,City..Etc
    And Navigate to Financial tab and enter details like Sales Setting,Sales Account..Etc
    
    Scenario: Verifying customer contact from customer tab
    Given User need to navigate customer tab
    And Search for the specific record and select the  customer contact
        
    Scenario: Archieve and restore the customer contact
    Given User need to navigate selected  customer contact and click archieve and restore the archieved contact
    
     Scenario: Delete the customer contact
    Given User need to Delete the selected customer contact

  Scenario: Create a contact for supplier
    Given User need to navigate to add an contact for supplier in contact page
   Then Enter details like ContactName,CompanyName,AccountNumber..Etc in Contact details section for supplier
   And Navigate to Address tab and enter details like Attention,PostalAddress,City..Etc for supplier
    And Navigate to Financial tab and enter details like Sales Setting,Sales Account..Etc for supplier
    
    Scenario: Verifying customer contact from Supplier tab
    Given User need to navigate Supplier tab
    And Search for the specific record and select the  Supplier contact
        
    Scenario: Archieve and restore the Supplier contact
    Given User need to navigate selected  Supplier contact and click archieve and restore the archieved contact
    
     Scenario: Delete the Supplier contact
    Given User need to Delete the selected Supplier contact
    
 
  Scenario: Manage contact group Create-scenario
    Given User need to navigate to Manage Contact group page
    And User need to create a new contact group by entering Groupname

 
  Scenario: Edit contact group Create-scenario
    Given User need to Edit a new contact group by changing Groupname

 
  Scenario: Delete contact group Create-scenario
    Given User need to delete a new contact group
    