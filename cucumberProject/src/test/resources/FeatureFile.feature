@Login
Feature: Login Functionality

Scenario:User logs with valid credentials

Given The user is on the login page
When The user enters a valid username and password
And Clicks the login button
Then The User Should be redirected to the home page

Scenario:User attempts to login with invalid username and password

Given The user is on the login page
When The user enters invalid username and invalid password 
And Clicks the login button
Then An error message should be displayed