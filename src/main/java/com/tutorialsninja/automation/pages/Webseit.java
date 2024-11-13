package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class Webseit {

	public Webseit() {
		
		PageFactory.initElements(Base.driver,this);
	}
	@FindBy(xpath="//input[@type=\"search\"]")
	public static WebElement searchplace;
	
	@FindBy(xpath="//input[@class=\"control icon-only\"")
	public static  WebElement searchbar;
	
}
