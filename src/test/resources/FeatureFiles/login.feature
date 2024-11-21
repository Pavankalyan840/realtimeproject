Feature: Login page finctionally scenario

@Login @One 
Scenario: verfiy Whether the user able to login with  valid details
Given I luanch the application 
And  I navigate to Account login page 
When I login to Apllaiction using username "pavanakalyan12307@gmail.com" and password "99663311"
Then I should see tat the user is able to login successfully  

@Login @Two 
Scenario: verfiy whether the user is not able to login with invaild credantials
Given I luanch the application 
And I navigate to Account login page 
When I login to the Application using Username "pavankalyan12307@gmail.com" and password  "99663311"
Then I should see an error message that credantilals are invaild 

@Login @Three
Scenario: verfiy wherther the user is not able to login without providing credentials
Given I launch the Application
And I navigate to Account Login page 
When I login to the Applaction using Username " " and password " "
Then I should see an error message that the credantials are invaild

@Login @Four
Scenario: verfiy wherther the user is able to reset the forgotten password 
Given I launch the Application
And I navigate to Account Login page 
When I reset the forgotten password for email "pavankalyan12307@gmial.com"
Then I should see  a message informing  the user that information realted to restting password have been sent to email address  

