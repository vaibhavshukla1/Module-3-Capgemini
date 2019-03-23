Feature: login to flipkart
Scenario: login user
Given flikart login page
When mobile number and password are correctly entered
Then redirect to flipkart website
When mobile number or password is wrong
Then login fails 