@Regression7

Feature: Login with Suspended User Account
  Scenario: Suspended user login attempt
    When User enters username "suspended.user@wms.app"
    And User enters password "password123"
    And User clicks on Login
    Then A suspension message "Your account has been suspended" should be displayed