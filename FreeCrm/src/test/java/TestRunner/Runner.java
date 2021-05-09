package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/InvalidCase.feature",glue= {"StepDefinition"},
plugin= {"pretty","html:JunitReport/InvalidCase/htmlreport",
		"json:JunitReport/InvalidCase/jsonreport.json",
		"junit:Junit/InvalidCase/xmlreport.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:JunitReport/InvalidCase/cucumber-reports/report.html"})


public class Runner {

}

