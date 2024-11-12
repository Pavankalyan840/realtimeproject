package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class Registerpage {
	public Registerpage() {
		PageFactory.initElements(Base.driver, this);
}
	@FindBy(id="input-firstname")
	public static WebElement fristname;
	
	@FindBy(id="input-lastname")
	public static WebElement lastname;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;

	@FindBy(id="input-confirm")
	public static WebElement passwordconfirm; 
	
	@FindBy(name="agree")
	public static WebElement privacypolicy;
	
	@FindBy(css="input[type=\"submit\"][value=\"contine\"]") 
	public static WebElement continuebutton;
	
	public static void enterAllDetails(DataTable dataTable) {
		 Map<String,String> map= dataTable.asMap(String.class,String.class);
		   Elements.TypeText(Registerpage.fristname,map.get("Friatname"));
		   Elements.TypeText(Registerpage.lastname,map.get("Lastname"));
		   Elements.TypeText(Registerpage.email,map.get("Email"));
		   Elements.TypeText(Registerpage.telephone,map.get("Telephone"));
		   Elements.TypeText(Registerpage.password,map.get("Password"));
		   Elements.TypeText(Registerpage.passwordconfirm,map.get("Password"));
	}
}
