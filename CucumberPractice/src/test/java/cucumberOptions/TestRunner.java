package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (
					features = "src\\test\\java\\featureLayer"
					, glue = "stepDefinition"
//					, dryRun = true
					, monochrome = true
					,plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		
				 )
public class TestRunner extends AbstractTestNGCucumberTests {

}
