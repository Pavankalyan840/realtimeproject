package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSectionpage {
 
	public HeadersSectionpage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//span[text()=\"My Account\"]")
	public static WebElement myAccountlink;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	public static WebElement Register ;
   
	@FindBy(xpath="//a[text()=\"Login\"]")
	public static WebElement Login;
  
	@FindBy(xpath="//input[@placeholder=\"Search\"]")
	public static WebElement searchboxfield;

	@FindBy(css="button[class$=\"btn-lg\"]")
	public static WebElement searchButton;


@FindBy(xpath="//span[text()='Shopping Cart']")
public static WebElement shoppingcart;

public static void carts() {
Elements.click(shoppingcart);
}
	
public static void navigatepage () {
	Elements.click(myAccountlink);
	Elements.click(Login);
}
public static void SamsungScynmaster() {
	Elements.TypeText(searchboxfield,Base.reader.getproduct());
	Elements.click(searchButton);
}
	

}
