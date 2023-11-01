package knights.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "knights.bdd.steps",
        tags = "@US_2, US_4 ",
        dryRun =true, //if true wont run steps just check for un implemented stages
        plugin = {
                "html:target/html_report/report.html"}

)
public class TestRunner {
}
