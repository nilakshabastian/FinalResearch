@Regression2
Feature: Add Users in User Management

  Scenario: Successfully Add to Users in User Management
    Given I navigate to The WHS Login page
    When I navigate to Add User page
    And the admin adds a new user with valid details
