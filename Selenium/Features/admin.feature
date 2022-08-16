Feature: Testing admin side of website

  Scenario: Admin Login and other functionality using valid credentials
    
    Given admin is on login page
    When admin enters valid email and password
    And admin clicks on login button
    Then admin will be navigated to home page
    
    And admin will click on Bookings
    And admin will click on Paid Bookings
    And admin will click on invoice of one of the record
    
    And will click on Cancelled Bookings
    And admin will click on delete button
    
    And admin will click on Pending Bookings
    And admin will convert one of record to Confirmed Bookings
    And navigate to booking page
    
    And click on website
    And close the application for admin

  Scenario: Admin Login using invalid credentials
    
    Given admin is on login page
  
    When admin enters invalid email and password
    And admin clicks on login button
    Then admin will be unable to login
    And close the application for admin
