Feature: Access Inbox to retrieve pending task
  In order to retrieve pending tasks
  As a user
  I should be able to click on Inbox menu

  
  @intranetsanity
   Scenario: Access Inbox to retrieve pending task
  	Given the user login to the application with username 'LTANCSSUPER01' and password 'password1'
  	When the user traverse to 'Inbox' menu 
  	Then verify list of pending tasks are displayed
  	