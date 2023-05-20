Feature: place the order for kart

@PlaceOrder
Scenario Outline: Search experience for the homepage and the offerpage
Given User is on GreenKart Landing page
When User searched with the short name <Name> and extracted actual name of the product
Then User searched for same short name <Name> in offers page to check if product exists
And validate the home page product with offer page product

Examples:
|Name|
| Tom |
| Beet |