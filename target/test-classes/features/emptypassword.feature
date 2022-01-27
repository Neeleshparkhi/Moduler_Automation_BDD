Feature: Empty password filed

Scenario: Empty password field should show the error message after clicking on signin

Given Navigate to Login page "https://secure-sandbox.modulrfinance.com/"
And Enter username "neelesh.parkhi41"
When Keep password filed is empty
Then Click on Signin button
And This field is required at password