package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
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
	
	Waits wait =new Waits();
	
	@Given("^I lanuch the application$")
	public void i_lanuch_the_application()  {
		Base.driver.get(Base.reader.getUrl());
	}

	

	@And("^I navigate to account registertion page$")
	public void i_navigate_to_account_registertion_page()  {
		Elements.click(HeadersSection.myAccountlink);
	    Elements.click(HeadersSection.Register);
	    
	}



	@When("^I fill all the below valid details$")
	public void i_fill_all_the_below_valid_details(DataTable dataTable) {
	Registerpage.enterAllDetails(dataTable,"unqiue");
	    
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

	@Then("^I should see that the user Account is not created$")
	public void i_should_dee_that_the_user_Account_is_not_created()  {
      Assert.assertTrue(Elements.isDisplayed(Registerpage.RegisterBreadcrumb));	    
	    throw new PendingException();
	}

	@Then("^I should see the error message imforming the user to fill the mandatory fields$")
	public void i_should_see_the_error_message_imforming_the_user_to_fill_the_mandatory_fields()  {
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.fristnamewarning));
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.lastnameWarning));
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.emailwarning));
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.telephonewarning));
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.passwordwarning));
	    Assert.assertTrue(Elements.isDisplayed(Registerpage.mainwarning));
	    }
    @And("^I subcribe to newletter$")
    public void I_subcribe_to_newletter() {
    	Elements.click(Registerpage.yesTOnewsletter);
    }
    @When("^I provide the below duplicate details$")
    public void I_provide_the_below_duplicate_details(DataTable dataTable) {
    	Registerpage.enterAllDetails(dataTable,"dupilcate");
    }
 @Then ("^I should see that the user is restriced from creating dupblicate account$")
 public void  I_should_see_that_the_user_is_restriced_from_creating_dupblicate_account() {
	 
	 Assert.assertTrue(Elements.VerifyTextEquals(Registerpage.mainwarning," warning : E-mail Address is already registered "));
 }
 
}
