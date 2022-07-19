package googleSearch;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature_File/searchGoogle.feature", glue= {"googleSearch"}, 
monochrome = true, tags = ("@Regression, @Smoke"),
plugin = {"pretty","html:ReportsForGoogleSearch/html"
		})

public class TestRunner {

}
