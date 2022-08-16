Feature: Testing supplier side of website

  Scenario: Supplier Login and other functionality using valid credentials
    
    Given supplier is on login page
    When supplier enters valid email and password
    And supplier clicks on login button
    Then supplier will be navigated to home page
    
    And supplier will click on Dashboard
    And supplier to check on text Sales overview and summary
    
    And supplier will check for Revenue Breakdown
    
    And supplier will click on Bookings
    And supplier will click on Pending Bookings
    And supplier will convert one of record to Confirmed Bookings
    
    And supplier to be taken to main page
    And supplier will check if Flight is displayed and if yes will check if it is clickable
    And supplier will check if Visa is displayed and if yes will check if it is clickable
    And supplier will check if Tours is displayed and if yes will check if it is clickable
    And supplier will check if Bookings is displayed and if yes will check if it is clickable
    And close the application for supplier

  Scenario: Supplier Login using invalid credentials
    
    Given supplier is on login page
    When supplier enters invalid email and password
    And supplier clicks on login button
    Then supplier will be unable to login
    And close the application for supplier
