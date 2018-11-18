package es.eduardodediegolucas.rest.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumber-test/friday-yet.feature",
		glue = "es.eduardodediegolucas.rest.steps",
		format = "pretty")
public class FridayDayOfWeekUnitTest {
}
