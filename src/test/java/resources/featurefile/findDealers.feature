@regression
Feature: Find the dealers and verify

  @Smoke
  Scenario Outline: Find the dealers and verify the dealers are in list
    Given I am on HomePage
    When I mouse hover on buy/sale Tab
    And I click on find a'Dealer'
    Then I navigate to 'car-dealers' page
    And I should see the dealer names "<dealersName>"
    Examples:
      | dealersName             |
      | 3 Point Motors Epping   |
      | 4WD Specialist Group    |
      | 5 Star Auto             |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY       |
      | ANDREA MOTORI SERVICE   |
      | Oxford Motors           |