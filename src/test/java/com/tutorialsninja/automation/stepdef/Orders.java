package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Orders {
	SearchResultpage searchResultpage=new SearchResultpage();
	HeadersSectionpage HeadersSectionpage =new HeadersSectionpage();
	loginpage Logipage= new loginpage();
	Orderspage orderspage=new Orderspage();
	ordersuccesspage Ordersuccesspage =new ordersuccesspage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() {
		Browser.opentheApplaction();
		HeadersSectionpage.navigatepage();
		loginpage.Dologin();
	}

	@When("^I add a prdouct to bag and checkout$")
	public void i_add_a_prdouct_to_bag_and_checkout() {
		HeadersSectionpage.SamsungScynmaster();
		SearchResultpage.fristaddtocartopction();
		HeadersSectionpage.shoppingcart();
	}
	@When("^I place an order$")
	public void i_place_an_order() {
		Orderspage.ordersuccessfully();
	}

	@Then("^I shouls see that the order is placed successfully$")
	public void i_shouls_see_that_the_order_is_placed_successfully() {
		Assert.assertTrue(ordersuccesspage.ordersucess);
	}
}
