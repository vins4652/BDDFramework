Feature: GreenKart AddTo Cart

Scenario: validate vegitable is added in add to cart

  Given Open the browser
  When Navigate to the url
  Then Home page is displayed
  When search the vegitable in the searchbar
  And  add two kg vegitable
  And  Click on add to cart
  Then check the one item is added to the cart
