package google;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features= {"src/test/resources/features/google.feature"},
        //glue = "steps",
        format={"pretty"})
public class Runner {
}
