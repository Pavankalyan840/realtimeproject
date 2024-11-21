package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class loginpage {

	
	public loginpage() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//input[@id=\"input-email\"]")
	public static WebElement emailfield;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	public static WebElement passwordfield;
	
    @FindBy(xpath="//input[@class=\"btn btn-primary\"]")
    public static WebElement loginbutton;
    @FindBy(xpath="//div[@class=\"alert alert-danger alert-dismissible\"]")
    public static WebElement alertdanger;
    
    @FindBy(linkText="Forgotten Password")
    public static WebElement forgotPassword;
    
    public static void  dologin(String email,String password ) {

	    Elements.TypeText(loginpage.emailfield,email );
	    Elements.TypeText(loginpage.passwordfield, password);
	    Elements.click(loginpage.loginbutton);
	
    }
    public static void Dologin() {
    	Elements.TypeText(emailfield,Base.reader.getuserId());
    	Elements.TypeText(passwordfield,Base.reader.getpassword());
    	Elements.click(loginbutton);
    }
}

