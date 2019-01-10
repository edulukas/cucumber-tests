package es.eduardodediegolucas.rest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Slf4j
public class StepDefinitionsSunday {

  LocalDate localDate;
  boolean response;

  @Given("^today is Sunday$")
  public void givenTodayIsSunday() {
    localDate = LocalDate.now()
            .withDayOfMonth(18)
            .withMonth(11)
            .withYear(2018);
  }

  @When("^I ask whether it's Friday yet$")
  public void whenIAskWhetherItsFridayYet() {
    response = DayOfWeek.FRIDAY.equals(localDate.getDayOfWeek());
  }

  @Then("^I should be told \"([^\"]*)\"$")
  public void iShouldBeTold(String answer) {
    Assert.assertEquals(Boolean.FALSE, response);
    log.info("Answer is {}", answer);
  }
}
