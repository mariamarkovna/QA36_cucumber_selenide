Feature:Chose Product and add this one in Warenkorb

  Scenario: Adding Product to Cart

    Given we a logged in
    * chose a category Damen
    * we are in Damenmode page
    * in Damenmode page click on product
    When we are in Product page
    * add product in den Warenkorb
    Then we see Model dialog and press Zum Warenkorb button

    When we are in Basket
    Then we see chosen Product

    When we delete product from Warenkorb
    And Click on Weiter einkaufen button
    Then Home Page is loaded