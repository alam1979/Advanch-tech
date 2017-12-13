@login
Feature: Login function validation

Scenario: Successful Login with Valid Credentials
	Given User able to open browser and go to UPS home page
	When User Navigate to Login button
	And User enters valid credentials for login
	|UserName		|Password|
    | Sarower2017	| Ttech123$ |
    
	Then Message displayed Login Successfully