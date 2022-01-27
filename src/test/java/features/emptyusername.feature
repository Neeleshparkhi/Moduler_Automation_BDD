Feature: Empty password filed

Scenario: Empty password field should show the error message after clicking on signin

Given Navigate to login page "https://secure-sandbox.modulrfinance.com/"
And Keep username field empty
When Enter password "Welcome@2022"
Then Click on Signin button
And This field is required at username