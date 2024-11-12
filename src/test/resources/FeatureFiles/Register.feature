 Feature: Registration  functionally scenarios
 
 Scenario: verify whether the user able to register into the application by providing all the details 
  Given I Launch the application
  And  I navigate account register page 
  When I fill all the below valid details
  | FristName | k.pavan              |
  | LastName  | L                    |
  | Email     | panihoney8@Gmail.com |
  | Telephone | 7660823309           |
  | Password  | 99663311             |
  And I select the Privacy policy
  And I click on Continue Button
  Then I Should see that the user account has been created  successfully