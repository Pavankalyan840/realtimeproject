Feature: end to end scenario for placing order

@Order @One
Scenario: verfiy wherther the user is able to place order 
Given I login to the application 
When I add a prdouct to bag and checkout 
And I place an order 
Then I shouls see that the order is placed successfully
