package cucumber.Options;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import io.cucumber.core.options.Constants;
import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.core.options.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//@SelectPackages("features") 
@SelectClasspathResource("features\\placeValidations.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinations") // Package of your step definitions
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@DeletePlace")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/jsonReports/cucumber-report.json") // Reporting options

public class TestRunner {

}
