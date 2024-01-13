package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions (
					features = "src\\test\\java\\featureLayer\\Login.feature",
					glue = "stepDefinition"
		
				 )
public class TestRunner extends AbstractTestNGCucumberTests {

}
