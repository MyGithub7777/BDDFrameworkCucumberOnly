Feature: Signup functionality

Scenario: create account

Given open home page on browser
When click on signup link
And enter username "testacc52" and enter password "test" and click on signup button
Then account created successfully and showing "Sign up successful."