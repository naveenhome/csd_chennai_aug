Feature: RPN

  Scenario Outline: Regression Test
    Given user enter <data>
    Then system show <result>

    Examples: 
      | data        | result |
      | "3 4 +"     | "7"    |
      | "3 4 + 3 +" | "10"   |
