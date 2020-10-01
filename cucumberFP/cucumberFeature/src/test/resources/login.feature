Feature: Login
  I want to run a sample feature file

  Scenario: cucumber setup
    Given the user is on the user login page
    When the user enters the email as "kenadams@gmail.com" and password as "ken@123"
    Then login should be successful
