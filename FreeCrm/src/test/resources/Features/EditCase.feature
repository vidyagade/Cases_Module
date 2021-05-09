Feature: Edit a case

Background: User is Logged In FreeCRM
Given User navigates to the login page of FreeCRM
When User logs in with username and password in FreeCRM
Then User should login and should be on home page of FreeCRM

@edit
Scenario: User edit the case
When User select particular case and click on edit
Then User should edit case and click on save
And User should able to see edited case 

