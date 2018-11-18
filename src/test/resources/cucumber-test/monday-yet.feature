Feature: Is it Monday already?
  Everybody wants to know when it's Monday

  Scenario: Saturday isn't Monday
    Given today is Saturday
    When I ask whether it's Monday already
    Then I must be told "Not yet!"