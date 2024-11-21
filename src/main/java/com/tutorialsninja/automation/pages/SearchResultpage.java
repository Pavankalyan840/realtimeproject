package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultpage {
  public SearchResultpage() {
	  PageFactory.initElements(Base.driver, this);
  }
	
	@FindBy(linkText="HP LP3065")
	public static WebElement HP ;
	
	@FindBy(xpath="//span[text()='Add to Cart'][1]")
	public static WebElement Fristaddtocart;
	
public static void fristaddtocartopction() {
	Elements.click(SearchResultpage.Fristaddtocart);

}

}