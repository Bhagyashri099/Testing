package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
public class TestRunner 
{


		@CucumberOptions(features= {"C:\\Users\\budchane\\Desktop\\New folder\\WP\\CucumberSelenium\\src\\test\\resources\\FeatureFiles\\login.feature"},
				glue= {"StepDefinitions"},
				plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				)

				public class LoginRunner extends AbstractTestNGCucumberTests{

				}

}
