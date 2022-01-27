Feature: Forgot password

Scenario: User should be able to generate password in case of forgot password.

Given Navigate to Landing_page "https://secure-sandbox.modulrfinance.com/"
And User click on forgot password
When user provide the username "neelesh.parkhi41"
And click on Request a reset button
Then Email should send to user emailid
