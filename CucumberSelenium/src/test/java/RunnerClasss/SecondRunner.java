package RunnerClasss;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C:\\Users\\budchane\\Desktop\\New folder\\WP\\CucumberSelenium\\src\\test\\resources\\FeatureFiles\\pdf.feature"},
glue= {"StepDefinitions"},
plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

 public class SecondRunner extends AbstractTestNGCucumberTests{



}


