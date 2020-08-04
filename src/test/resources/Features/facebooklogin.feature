#Author: Ayyappa
Feature: Facebook login selenium

  @FBLogin
  Scenario Outline: FB login Test Case 1
    Given user loads FB page
    When user enters <username> and <password>
    And clicks on Login button
    Then user lands on Dashboard page

    Examples: 
    	|username|password|
    	| ayyappa.thalla@gmail.com | Iyyappa@123 |
      | thalla.ayyappa@gmail.com | Iyyappa@123 |
     
