Feature: view a case

Background: User is Logs In
Given User navigates to login page of FreeCRM
When User enters his username and password
Then User should login and be on home page of FreeCRM

@view
Scenario: User view the case
When User select particular case and click on view
Then User should see that case

