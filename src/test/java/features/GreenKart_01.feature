Feature: Search in Landing page and Offer page

@SearchItem
Scenario Outline: Search experience for the homepage and the offerpage
Given User is on GreenKart Landing page
When User searched with the short name <Name> and extracted actual name of the product
And Add the 3 quantity of <Name> searched item to the cart
Then User proceeds to the checkout page and validate the <Name> item in checkout page
And verify user has abiity to enter promocode and place the order

Examples:
|Name|
| Tom |
| Beet |