package com.tutorialsninja.automation;

import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.Forgotpasswordpage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.MyAccountpage;
import com.tutorialsninja.automation.pages.loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class Login {
	
	public Login() {
		
	PageFactory.initElements(Base.driver, this );
}

	
	HeadersSection headersSection =new HeadersSection();
	loginpage Loginpage= new loginpage();
	MyAccountpage myaccountpage =new MyAccountpage();
	
	@Given("^I navigate to Account login page$")
	public void i_navigate_to_Account_login_page() {
	    Elements.click(HeadersSection.myAccountlink );
	    Elements.click(HeadersSection.Login);
	}

	@When("^I login to Apllaiction using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_to_Apllaiction_using_username_and_password(String email, String password)  {
		loginpage.dologin(email, password);}
	}

	@Then("^I should see tat the user is able to login successfully$")
	public void i_should_see_tat_the_user_is_able_to_login_successfully() {
	Assert.assertTrue(Elements.isDisplayed(MyAccountpage.registerAffiliatreAccount));
	}
	
	@Then("^I should see an error message that credantilals$")
    public void I_should_see_an_error_message_that_credantilals() {
		Assert.assertTrue(Elements.VerifyTextEquals(loginpage., "warning wherther the deitals are not right "));
}

	@Then("^I reset the forgotten password$ for email\"([^\"]*)\"$")
	public void I_reset_the_forgotten_password() {
		Elements.click(loginpage.Forgotpasswordpage);
		Elements.TypeText(Forgotpasswordpage.continuebutton, email);
		Elements.click(Forgotpasswordpage.continuebutton);
	}
	 
	@Then ("^I should see  a message informing  the user that information realted to restting password have been sent to email address")
	public void I_should_see_a_message_informing_the_user_that_information_realted_to_restting_password_have_been_sent_to_email_addre() {
		Assert.assertTrue(Elements.VerifyTextEquals(loginpage.alertdanger,"An email with a confirmation link has been sent your email address" )); 
	}