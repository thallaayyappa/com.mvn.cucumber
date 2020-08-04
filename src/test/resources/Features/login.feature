
#Author

@smoketest
Feature: 
@smoketest
  Scenario Outline: check login is sucess
    Given user is on login page
    When user enters usrname and passwod
    And clicks on login
    Then user is navigated to dashboard
    
 Examples:
 |username|password|
 |user1|pass1|
