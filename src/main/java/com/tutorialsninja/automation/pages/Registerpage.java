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
	
	@FindBy(linkText="Register")
	public static WebElement RegisterBreadcrumb;
	
	@FindBy(css="input[id=input-firstname]+div")
	public static WebElement fristnamewarning;
	
	@FindBy(css="input[id=input-lastname]+div")
	public static WebElement lastnameWarning ;
	
	@FindBy(css="input[id=input-email]+div")
	public static WebElement  emailwarning;
	
	@FindBy(css="input[id=input-telephone]+div")
	public static WebElement  telephonewarning;
 
	@FindBy(css="input[id=input-password]+div")
	public static WebElement passwordwarning ;
	
	@FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")
	public static WebElement mainwarning;
	
	@FindBy(css="input[name=\"newsletter\"][value=\"1\"]")
	public static WebElement yesTOnewsletter;
	
	public static void enterAllDetails(DataTable dataTable,String detailsType) {
		
		Map<String,String> map= dataTable.asMap(String.class,String.class);
		   Elements.TypeText(Registerpage.fristname,map.get("Friatname"));
		   Elements.TypeText(Registerpage.lastname,map.get("Lastname"));
		   Elements.TypeText(Registerpage.telephone,map.get("Telephone"));
		   Elements.TypeText(Registerpage.password,map.get("Password"));
		   Elements.TypeText(Registerpage.passwordconfirm,map.get("Password"));
		   
		   if(detailsType.equalsIgnoreCase("duplicate"))
			   Elements.TypeText(Registerpage.email, map.get("Email"));
		   else  
			   Elements.TypeText(Registerpage.email,System.currentTimeMillis()+ map.get("Email"));
	}

}
