package es.eduardodediegolucas.rest.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumber-test/countries-get-all.feature",
		glue = "es.eduardodediegolucas.rest.steps",
		format = "pretty")
public class GetAllCountriesIntegrationTest {
}
