@login
Feature: Login function validation 

Background: 
	Given  User is on facebook login Page 
	When  User click to Login button 

Scenario Outline: Successful Login with Valid Credentials 

	And  User enters valid email from <UserName> table 
	And  User enter valid pass from <Password> table 
    Then  Validate Login is Successfull 
	
	Examples: 
		|UserName		|Password|
    | Sarower2017	| Ttech123$ |
	