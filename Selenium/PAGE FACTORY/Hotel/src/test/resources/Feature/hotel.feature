Feature: Hotel Booking

Scenario: Varify title of hotel booking
Given Hotel Booking Page
Then tile varified

Scenario: Hotel Booking Fails On Leaving FirstName Blank 
Given Hotel Booking Page
When  first name is not entered
Then Booking fails

Scenario: Hotel Booking Fails On Leaving LastName Blank
Given Hotel Booking Page
When last name is empty
Then Booking fails

Scenario: Hotel Booking Fails On Leaving Email Blank
Given Hotel Booking Page
When email is not entered
Then Booking fails

Scenario: Hotel Booking Fails On Entering Invalid Email
Given Hotel Booking Page
When wrong email is entered
Then Booking fails

Scenario: HotelBooking Fails On Leaving Address Empty
Given Hotel Booking Page
When address is not entered
Then Booking fails

Scenario: Hotel Booking Fails On Not Selecting any City
Given Hotel Booking Page
When city is not selected
Then Booking Fails

Scenario: Hotel Booking Fails On Not Selecting any State
Given Hotel Booking Page
When state is not selected
Then Booking Fails

Scenario: Hotel Booking Fails On Not Entering CardHolderName 
Given Hotel Booking Page
When card holder name not entered
Then Booking fails

Scenario: Hotel Booking Fails On Not Entering CardNumber 
Given Hotel Booking Page
When card number not entered
Then Booking fails

Scenario: Hotel Booking Fails On Not Entering cvv 
Given Hotel Booking Page
When cvv not entered
Then Booking fails

Scenario: Hotel Booking Fails On Not Entering Expiry Month 
Given Hotel Booking Page
When expiry month not entered
Then Booking fails

Scenario: Hotel Booking Fails On Not Entering Expiry Year 
Given Hotel Booking Page
When expiry year not entered
Then Booking fails

Scenario: Hotel Booking Confirmed 
Given Hotel Booking Page
When all details are entered correctly
Then Booking confirmed-
