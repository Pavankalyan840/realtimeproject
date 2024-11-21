 Feature: Registration  functionally scenarios
 @Register @One
 Scenario: verify whether the user able to register into the application by providing all the details 
  Given I lanuch the application
  And I navigate to account registertion page 
  When I provide all the below details 
  | FristName |" pavan"              |
  | LastName  | "kalyan"                    |
  | Email     | "panihoney8@Gmail.com" |
  | Telephone |" 7660823309           "|
  | Password  | "99663311   "          |
  And I select the Privacy policy
  And I click on Continue Button
  Then I Should see that the user account has been created  successfully
 
  @Register @Two
  Scenario:  verify whether the user is not allowd on skipping the mandatory fields
  Given I launch the appliaction 
  And I navigate to account registertion page
  When i click on two Continue Button 
  Then I should see that the user Account is not created 
  And I should see the error message imforming the user to fill the mandatory fields 
  		 	 
 @Registre @Three
  Scenario: verify whether the user able to register into the application by providing all the details 
  Given I lanuch the application
  And I navigate to account registertion page 
  When I provide all the below details 
   | FristName |" pavan"              |
  | LastName  | "kalyan"                    |
  | Email     | "panihoney8@Gmail.com" |
  | Telephone |" 7660823309           "|
  | Password  | "99663311   "          |
  And I select the Privacy policy
  And I subscribe to newsletter 
  And I click on continue Button
  Then I should see that the user account has successfully created 
  
  @Registre @Four
  Scenario: verify whether the user is restricet from creating a duplicate account 
  Given I luanch the application 
  And I navigate to account registration page 
  When I provide the below duplicaate details 
   | FristName |" pavan"              |
  | LastName  | "kalyan"                    |
  | Email     | "panihoney8@Gmail.com" |
  | Telephone |" 7660823309           "|
  | Password  | "99663311   "          |
   And I select the Privacy policy
  And I click on Continue Button
  Then I Should see that the user is restriced from creating duplicate account   
  