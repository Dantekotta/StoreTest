Feature: Address

  Scenario Outline: Adding new address
    Given User is on "https://mystore-testlab.coderslab.pl/" site
    When User login to account with "<email>" i "<passwd>"
    And  User click on Addresses and Add Address buttons
    And User fills the form with "<alias>", "<address>", "<city>", "<zip>", "<country>", "<phone>" and confirms
    Then New address should appear with "<alias>", "<address>", "<city>", "<zip>", "<country>", "<phone>"
    And browser close
    Examples:
      | email                 | passwd      | alias  | address | city   | zip      | country        | phone     |
      | witin26173@yasiok.com | Password123 | allias | adres   | misato | pocztowy | United Kingdom | 123456789 |

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

