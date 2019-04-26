Feature: Paying for product
Scenario: The one where the user added atleast one product to the cart and performing the payment to successful order
When Lalitha added a headphone to the cart
And checkout for the payment
Then the product is successfully orderd