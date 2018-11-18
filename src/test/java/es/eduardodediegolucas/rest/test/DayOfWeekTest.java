package es.eduardodediegolucas.rest.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import es.eduardodediegolucas.rest.categories.IntegrationTest;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumber-test",
		glue = "es.eduardodediegolucas.rest.steps",
		format = "pretty")
@Category(IntegrationTest.class)
public class DayOfWeekTest {
}
