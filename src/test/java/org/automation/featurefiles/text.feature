Feature:  Validate the user Api

@AddUser
Scenario Outline: Validate user is getting the user list 
Given Add User Payload "<name>","<job>"
When User call the api with the POST "AddUser" request
Then Status in response Body is OK And Status Code is 201



Examples: 
		  |name		|job	 |
		  |morpheus123 |leader  | 
		  |Asrpher123  |Manager | 
		  
@UpdateUser
Scenario Outline: Validate user Information are Updated
Given Add User Payload "<name>","<job>"
When User call the api with the POST "UpdateUser" request
Then Status in response Body is OK And Status Code is 200



Examples: 
		  |name		|job	 |
		  |morpheus |leader  | 
		  |Asrpher  |Manager | 
