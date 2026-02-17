package RunnerClasss;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/FeatureFiles"},
glue= {"StepDefinitions"},
plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

 public class SecondRunner extends AbstractTestNGCucumberTests{



}


