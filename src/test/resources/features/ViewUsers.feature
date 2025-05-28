@Regression1
  Feature: View	Users in User Management

    Scenario: Successfully Navigate to View	Users in User Management
      Given I navigate to The WHS Login page
      When I navigate to View User Management page
      Then Verify the User View
      And Logout From WHM

