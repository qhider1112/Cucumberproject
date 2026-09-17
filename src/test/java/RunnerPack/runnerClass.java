package RunnerPack;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFolder",glue = {"Step_Definition","Hooks"},tags = "@Flipkart",
dryRun = false,publish = true,plugin = {"pretty","html:target/Reports/report.html","json:target/Reports/report.json"})
public class runnerClass  {




}
