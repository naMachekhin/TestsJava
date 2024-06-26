@all
Feature: primeTest
    Tests are prime numbers correctly generated
    Scenario: Test basics
        Given Values that are less than two like <val>
        When I ask to generate next prime number to test default case
        Then I get 2
        Examples:
            | val   |
            | 1     |
            | -1    |
            | 0     |
            | -1000 |
    Scenario: Test main functionality
        Given Starting value <val>
        When I ask to generate next prime number
        Then I get result <answ>
        Examples:
            | val  | answ |
            | 2    | 3    |
            | 27   | 29   |
            | 1000 | 1009 |
            | 117  | 121  |


