Feature: Registration
  I want to run a sample feature file

  Scenario: cucumber setup
    Given the user is on the user registration page
    When the user enters valid data on the page "Ken","Adams","kenadams@gmail.com","ken@123","02-02-2020"
    Then the user registration should be successful
