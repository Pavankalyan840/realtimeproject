package com.tutorialsninja.automation;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultpage;
import com.tutorialsninja.automation.pages.onserachproduct;





public class search {
	HeadersSection headersSection =new HeadersSection();
	SearchResultpage searchResultpage=new SearchResultpage();
	onserachproduct Onserachproduct=new onserachproduct();
	@When("^I search for a product \"([^\"]*)\"$")
	public void I_search_for_a_product(String product) {
		Elements.TypeText(HeadersSection.searchboxfield, product);
		Elements.click(HeadersSection.searchButton);
	}
	Then("^I should see the product in the search result$")
	public void i_should_see_the_product_in_the_search_result()  {
		Assert.assertTrue(Elements.isDisplayed(isdispalyed(SearchResultpage.HP)));
	} 
	
	

	@Then("^I should see the page displaying the message \"([^\"]*)\"$")
	public void i_should_see_the_page_displaying_the_message(String message)  {
	    Assert.assertTrue(Elements.VerifyTextEquals(onserachproduct.Noserachproduct, message));
	}

}
