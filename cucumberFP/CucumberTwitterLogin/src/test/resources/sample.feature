Feature: annotation

Background: 
    Given the user is on Twitter log in page
Scenario: 
    When I enter the username as "Timon" and password as "Pumba"
    Then login should fail
