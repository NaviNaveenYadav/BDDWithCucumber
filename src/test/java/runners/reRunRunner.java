package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(	
	features = "@target/failedScenarios.txt",
	glue = {"stepDefs"},
	monochrome = true,
	plugin = {"pretty"})
public class reRunRunner extends AbstractTestNGCucumberTests {

}
