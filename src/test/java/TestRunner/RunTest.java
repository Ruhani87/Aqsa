package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"C:\\Users\\ruhan\\eclipse-workspace\\xyz\\src\\test\\resources\\Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "AmazonStepDef", tags= "@Book")

public class RunTest extends AbstractTestNGCucumberTests{

}
