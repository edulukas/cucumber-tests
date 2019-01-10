package es.eduardodediegolucas.rest.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.IOException;

@Slf4j
public class StepDefinitionsGetAllCountries {

  HttpUriRequest httpUriRequest;
  HttpResponse httpResponse;


  @Given("^a REST service \"([^\"]*)\"$")
  public void givenARestService(String url) {
    httpUriRequest = new HttpGet(url);
  }

  @When("^it is called$")
  public void whenItIsCalled() {
    try {
      httpResponse = HttpClientBuilder.create().build().execute(httpUriRequest);
    } catch (IOException e) {
      log.error("Something went wrong...", e);
    }
  }

  @Then("^I received a non-empty list of countries$")
  public void thenIReceivedANonEmptyListOfCountries() {
    Assert.assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
  }
}
