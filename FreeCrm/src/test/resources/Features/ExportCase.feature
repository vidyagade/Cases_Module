Feature: Export case
Description: Testing export option from dashboard

Background: User is Log In
Given User navigates to login page
When User logged in with username and password
Then User should login and be on home page

@export
Scenario: Exporting case
When User selects case from dashboard and clicks on export option
Then Case should be exported to documents section