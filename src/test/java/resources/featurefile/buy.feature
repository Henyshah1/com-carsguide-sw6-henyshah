Feature: Search functionality

  Background: I am on Homepage
    And  I  hover mouse on buy/sale tab

  @sanity
  Scenario Outline: Search the buy car with model
    When I click on 'Search Cars' link
    Then  I navigate to 'new and used car search' page
    And  I select make "<make>"
    And  I select model "<model>"
    And  I select location "<location>"
    And  I select price "<price>"
    And  I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make   | model | location     | price   |
      | Nissan | Juke  | SA Adelaide  | $7,500  |
      | Honda  | City  | NSW - Sydney | $15,000 |

@smoke
  Scenario Outline: Search the used car with model
    When I click 'Used' link
    And  I navigate to 'Used Cars For Sale' page
    And  I select make "<make>"
    And  I select model "<model>"
    And  I select location "<location>"
    And  I select price "<price>"
    And  I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make   | model | location     | price   |
      | Nissan | Juke  | SA Adelaide  | $7,500  |
      | Honda  | City  | NSW - Sydney | $15,000 |


