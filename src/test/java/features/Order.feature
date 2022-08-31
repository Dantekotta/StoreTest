Feature: Order

  Scenario Outline:  Order sweater
    Given  User is on "https://mystore-testlab.coderslab.pl/" site
    When User login to account with "<email>" i "<passwd>"
    And User click on Clothes
    And User choose Hummingbird Printed Sweater
    And User choose "<size>" and "<quantity>"
    And User clicks on Add to cart button
    And User proceed to checkout
    And User confirms address
    And User confirms shopping method
    And User choose option Pay by check and clicks on Order with obligation to pay
    Then Order is confirmed and Printscreen is taken
    And browser close
    Examples:
      | email                 | passwd      | size | quantity |
      | witin26173@yasiok.com | Password123 | M    | 13        |
