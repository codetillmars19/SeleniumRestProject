package sampleRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features"},
		glue = {"classpath:stepDef"},
		tags = {"@UITEST"}
		)

public class Runner {

}
