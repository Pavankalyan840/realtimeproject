Feature: search functionailty secnario

@Serach @One 
 Scenario: verfiy wherther the user is able to the product 
  Given I luanch the application 
  When I search for a product "Samsung Syncmaster 941BW"
  Then I should see the product in the search result 
  
  @Serach @Two
  Scenario: verify wherther the user is infoemed wwhen the product being searched is not availabel
  Given I luanch the application 
  When I search for a product "vivo y20g"
  Then I should see the page displaying the message "There is no product that matches the search criteria."
  