Feature: primeTest
  Tests are prime numbers correctly generated
  Scenario: Test basics
    Given Values that are less than two like "<val>"
    When I ask to generate next prime number
    Then I get 2
    Examples:
      | val   |
      | 1     |
      | 0     |
      | -1    |
      | -1000 |