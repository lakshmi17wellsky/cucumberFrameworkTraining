@SalesforceLeadsTest
Feature: Salesforce Lead
Creating a salesforceLead
  

  @CreateNewLead
  Scenario Outline: Create a Lead
    Given Launch the Salesforce application
    When User is on the HomePage, click on the AppLauncher
    And Select Sales from AppLauncher
    And User is on sales Dashboard click on Leads
    And Click on New to create a New Lead
    And Enter all the Mandatory Fileds "<FirstName>" "<LastName>" "<Company>" and click Save
    Then Lead should be created using given Name successfully

    Examples: 
      | FirstName | LastName | Company  |
      | Lakshmi  | Tester   | Wellcare |