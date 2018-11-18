package es.eduardodediegolucas.rest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Slf4j
public class StepDefinitionsMonday {

	LocalDate localDate;
	boolean response;

	@Given("^today is Saturday$")
	public void givenTodayIsSaturday(){
		localDate = LocalDate.now()
				.withDayOfMonth(17)
				.withMonth(11)
				.withYear(2018);
	}

	@When("^I ask whether it's Monday already$")
	public void whenIAskWhetherItsMondayAlready(){
		response = DayOfWeek.MONDAY.equals(localDate.getDayOfWeek());
	}

	@Then("^I must be told \"([^\"]*)\"$")
	public void iMustBeTold(String answer){
		Assert.assertEquals(Boolean.FALSE, response);
		log.info("Answer is {}", answer);
	}
}
