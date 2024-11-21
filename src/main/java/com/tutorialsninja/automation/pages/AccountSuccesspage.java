package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSuccesspage {

	@FindBy(xpath="//a[text()=\"Success\"]")
	public static WebElement successBreadcrumb;
}
