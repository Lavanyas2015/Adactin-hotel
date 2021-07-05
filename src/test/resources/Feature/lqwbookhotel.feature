#
Feature: Verify user can able to book the Hotel

 
  Scenario: Validate the Bookhotel screen
    Given User is in book hotel screen
    When User select the details and click on book now button
    Then Verify the booking number generated or not

