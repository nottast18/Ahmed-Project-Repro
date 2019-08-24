Feature: Walgreens product search functionality.
 # @Debug
  Scenario: Empty cart verify.

    Given search product as"Jock Itch Treatments"
    Then user select first product of productlist
    Then verify product name as "Lotrimin AF Antifungal for Jock Itch, Clotrimazole Cream"
    Then user click on add to card button.
    Then user click cartview button
    Then verify user in cartpage
    Then user click on remove button
    Then verify cartempty massage display
