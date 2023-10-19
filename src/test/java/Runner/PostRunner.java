package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\BDD2\\src\\test\\java\\feature\\Postwithparamerer.feature"},glue = {"C:\\BDD2\\src\\test\\java\\Steps"},dryRun = false)

public class PostRunner {
}
