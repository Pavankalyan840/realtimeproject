package com.tutorialsninja.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();
    public String getuserId();
    public String getpassword();
    public String getproduct();
    
}
