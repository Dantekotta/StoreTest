Feature: Address

  Scenario Outline: Adding new address
    Given User is on "https://mystore-testlab.coderslab.pl/" site
    When User login to account with "<email>" i "<passwd>"
    And  User click on Addresses and Add Address buttons
    And User fills the form with "<alias>", "<address>", "<city>", "<zip>", "<country>", "<phone>" and confirms
    Then New address should appear with "<alias>", "<address>", "<city>", "<zip>", "<country>", "<phone>"
    And News address is deleted
    And browser close
    Examples:
      | email                 | passwd      | alias  | address | city   | zip      | country        | phone     |
      | witin26173@yasiok.com | Password123 | allias | adres   | misato | pocztowy | United Kingdom | 123456789 |

