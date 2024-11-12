package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccesspage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.Registerpage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register { 
	HeadersSection headersSection =new HeadersSection();
	Registerpage registerpage=new Registerpage();
	AccountSuccesspage accountsuccesspage =new AccountSuccesspage();
	
	@Given("^I Launch the application$")
	public void i_Launch_the_application() {
	Base.driver.get(Base.reader.getUrl());
	        
	}

	@And("^I navigate account register page$")
	public void i_navigate_account_register_page()  {
	   Elements.click(HeadersSection.myAccountlink);
		    Elements.click(HeadersSection.Register);

	    
	}

	@When("^I fill all the below valid details$")
	public void i_fill_all_the_below_valid_details(DataTable datatable) {
	Registerpage.enterAllDetails(datatable);
	    
	}

	@And("^I select the Privacy policy$")
	public void i_select_the_Privacy_policy() {
	     Elements.click(Registerpage.privacypolicy);
	    
	}

	@And("^I click on Continue Button$")
	public void i_click_on_Continue_Button() {
	     Elements.click(Registerpage.continuebutton );
	    
	}

	@Then("^I Should see that the user account has been created  successfully$")
	public void i_Should_see_that_the_user_account_has_been_created_successfully() {
	   Assert.assertTrue(Elements.isDisplayed(AccountSuccesspage.successBreadcrumb));
	   
	}



}
