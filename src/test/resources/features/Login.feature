Feature: Salesforce Login Functionality

@Test
@LoginErrorMessage
Scenario: Login Error Message
    Given User is on the Salesforce application page
    When User enters username as "madhuri@tekarch.com"
    And User clears the password field
    And User clicks on the login button
    Then Error message "Please enter your password." should be displayed

Scenario: Login To Salesforce
    Given User is on the Salesforce login page
    When User logs in with valid username and password
    Then Home page should be displayed

Scenario: Check RememberMe
    Given User is on the Salesforce login page
    When User logs in with valid username and password and checks the remember username checkbox
    And User logs out of Salesforce
    Then Salesforce login page should be displayed with the username populated and the remember username checked
    And User checks for the username field

Scenario: Forgot Password - Test A
    Given User is on the Salesforce login page
    When User clicks on the "Forgot password" link
    And User provides the username for password reset
    Then Password reset message page should be displayed

Scenario: Forgot Password - Test B
    Given User is on the Salesforce login page
    When User enters an incorrect username and password
    And User clicks on the login button
    Then Error message "Your login attempt has failed..." should be displayed
