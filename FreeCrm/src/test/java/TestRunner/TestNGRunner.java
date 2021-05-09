package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Features/CreateCase.feature",glue= {"StepDefinition"},
plugin= {"pretty","html:TestNGReport/CreateCase/htmlreport",
		"json:TestNGReport/CreateCase/jsonreport.json",
		"junit:TestNGReport/CreateCase/xmlreport.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:TestNGReport/CreateCase/cucumber-reports/report.html"})
	public class TestNGRunner extends AbstractTestNGCucumberTests
	{
	
	}
