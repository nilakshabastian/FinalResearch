@Regression8

Feature: Login with Deleted User Account
  Scenario: Deleted user login attempt
    When User enters username for deleted user
    And User enters password for deleted user
    And User clicks on Login for deleted user
    Then A Deletion message "Your account has been Deleted" should be displayed