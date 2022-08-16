Feature: Testing website on Customer side

 Scenario: User Login and other functionality using valid credentials
 
  Given user is on login page
  And accept cookies
  When user enters valid email and password
  And user clicks on login button
  Then user will be navigated to home page

   And user clicks on My Bookings
   And user clicks on Add Funds
   And user clicks on My Profile
   And user clicks on Logout

   When user enters valid email and password
   And user clicks on login button

   And user clicks on Add Funds
   And click on Paypal
   And click on Pay Now
   And click on PayPal
   Then user will be navigated to paypal
   Then user enters his Paypal sandbox account email
   And user clicks on next
   And user enters his Paypal sandbox account password
   And user clicks on Login
   And user clicks on Pay Now
   And user comes back

   And user clicks on My Bookings with no scroll
   And user clicks on View Voucher for one record 

   And user clicks on My Profile
   And user will click on Address Input Box and update the address
   And user will click on Update Profile
   And close the application for user

  Scenario: user Login using invalid credentials

   Given user is on login page
   And accept cookies
   When user enters invalid email and password
   And user clicks on login button
   Then user will be unable to login
   And close the application for user
 