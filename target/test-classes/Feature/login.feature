Feature: Verify the login functionality of Adactin app

  Background: 
    Given User is in adactin login screen

  Scenario: Verify the login functionality of Adactin app
    When Enter the username "Ashlinkmathy" and password "Z58859"
    And User click on login button
    Then Verify user name and password 

    

 
