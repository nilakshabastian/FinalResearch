@Regression4
Feature: Suspend Users in User Management

  Scenario: Successfully Suspend Users in User Management
    Given I navigate to The WHS Login page
    When I navigate to View User Management page for suspend
    And Suspend the selected user
