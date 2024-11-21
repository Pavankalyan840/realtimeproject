package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tutorialsninja.automation.framework.Elements;

public class Orderspage {
	
	@FindBy(xpath="//a[text()='Checkout']")
	public static WebElement checkout;
	
	@FindBy(xpath="//input[@id=\"button-payment-address\"]")
	public static WebElement countine1;
	
	@FindBy(xpath="//input[@id=\"button-shipping-address\"]")
	public static WebElement countine2;

	@FindBy(xpath="//input[@id=\"button-shipping-method\"]")
	public static WebElement countine3;
	
	@FindBy(xpath="//input[@type=\"checkbox\"]")
	public static WebElement TreamAndcondactions;
	
	@FindBy(xpath="//input[@id=\"button-payment-method\"]")
	public static WebElement countine4;
	
	@FindBy(xpath="//input[@id=\"button-confirm\"]")
	public static WebElement conformorder;
	
	
	public static void ordersuccessfully() {
		Elements.click(checkout);
		Elements.click(countine1);
		Elements.click(countine2);
		Elements.click(countine3);
		Elements.click(TreamAndcondactions);
		Elements.click(countine4);
		Elements.click(conformorder);
	}

}
