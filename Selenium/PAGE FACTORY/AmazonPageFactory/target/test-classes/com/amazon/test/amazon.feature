Feature: login
Scenario: varification of user
Given amazon login page
When enter correct mobile number or email
Then next page is opened
When entered correct password
Then redirect to amazon website