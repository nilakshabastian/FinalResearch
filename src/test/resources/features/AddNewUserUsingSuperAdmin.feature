@Regression3
Feature: Add New User in User Management by Super Admin

  Scenario: Successfully Add to New User in User Management
    When User enters username for Super Admin
    And User enters password for Super Admin
    And User clicks on Login as Super Admin
    And User select the User Management page
    When I navigate to Add User page
    And Enter UserName to AddUser page
    And Enter EmployeeFName to AddUser page
    And Enter EmployeeLName to AddUser page
    And Enter Password to AddUser page
    And Enter REPassword to AddUser page
    And Select the Status AddUser page
    And Click the Create button AddUser page
    Then Verify the User in the Grip
