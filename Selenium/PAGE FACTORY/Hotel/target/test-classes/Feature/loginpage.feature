Feature: Login Hotel Booking

Scenario: Match title of login page
Given Login page
Then title matched

Scenario: Login Failed on Entering Wrong UserName
Given Login page
When wrong user name is entered
Then login failed

Scenario: Login Failed on Entering Wrong Password
Given Login page
When wrong password is entered
Then login failed

Scenario: Login Failed when UserName is Empty
Given Login page
When user name is empty
Then login failed without alert

Scenario: Login Failed when Password is Empty
Given Login page
When password is empty
Then login failed without alert

Scenario: Login Successful
Given Login page
When all details are entered correctlyy
Then login success 