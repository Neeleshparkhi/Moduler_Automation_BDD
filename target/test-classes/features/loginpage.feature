Feature: Application Login

Scenario: User should be able to login

Given Navigate to the Landing page "https://secure-sandbox.modulrfinance.com/"
When User id "neelesh.parkhi41" and Password "Welcome@2022" is entering and click on Signin Button
And Click on Login button
Then Home page should be visible

