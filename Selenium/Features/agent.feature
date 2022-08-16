Feature: Login  functionality for Agent

  Scenario: Agent Login and other functionality using valid credentials
    
    Given agent is on login page
    And agent accept cookies
    When agent enters valid email and password
    And agent clicks on login button
    Then agent will be navigated to home page
 
    
    And agent clicks on My Bookings
    And agent clicks on Add Funds
    And agent clicks on My Profile
    And agent clicks on Logout
    
    When agent enters valid email and password
    And agent clicks on login button
    Then agent will be navigated to home page
    
    And agent clicks on Home
    And agent clicks on Hotels
    And agent clicks on Flights
    And agent clicks on Tours
    And agent clicks on Visa
    And agent clicks on Blog
    And agent clicks on Offers
    
    And agent clicks on Hotels no scroll
    When agent enters a city
    And agent clicks on search
    And agent is on page displaying hotels available in the city
    
    And agent will click on dropdown button after USD and change it to INR
    And close the application for agent

  Scenario: Agent Login using invalid credentials
    Given agent is on login page
    And agent accept cookies
    When agent enters invalid email and password
    And agent clicks on login button
    Then agent will be unable to login
    And close the application for agent
