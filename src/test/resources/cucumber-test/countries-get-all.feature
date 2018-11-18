Feature: Get All Countries from REST service

  Scenario: Get a non-empty list of countries
    Given a REST service "http://services.groupkt.com/country/get/all"
    When it is called
    Then I received a non-empty list of countries