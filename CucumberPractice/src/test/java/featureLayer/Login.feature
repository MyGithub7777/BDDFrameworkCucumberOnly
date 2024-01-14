Feature: login functionality

Scenario: verify login with valid cred

Given open home page on browser
When click on login link 
And enter valid username and enter valid password and click on login button
Then user is logged in

Scenario: verify login with invalid cred

Given open home page on browser
When click on login link 
And enter invalid username and enter invalid password and click on login button
Then user is logged in