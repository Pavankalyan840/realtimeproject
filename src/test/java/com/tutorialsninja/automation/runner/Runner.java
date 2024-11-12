package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Register.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={
		"pretty",
		"html:target/cucumber/report.html",
		"json:target/cucumber/report.json",
		"json:target/cucumber/report.xml",
		"timeline:target/cucumber",
		"me.jvt.cucumber.report.prettyReports:tragets/cucumber",
		"rerun:traget/failedsecnarios.txt"
},

tags={"@Register","@One"})
public class Runner {
	
	

}