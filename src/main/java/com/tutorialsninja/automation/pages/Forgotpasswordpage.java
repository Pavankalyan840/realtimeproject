package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class Forgotpasswordpage {
	public Forgotpasswordpage(){
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id="input-email")
	public static WebElement emailfield;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]")
	public static WebElement continuebutton;
}
