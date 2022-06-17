Feature: F08_WishList  |  guest user could add products to wishlist

  Background: user login first
    When      user navigate to login page
    And       user enter "islamtoba@gmail.com" and "Password123"
    Then      user click on login button
    And       user could login successfully and go to home page


  Scenario: success message is visible after adding item to wishlist
    When    user add item to wishlist
    Then    wishlist notification success is visible


  Scenario: number of wishlist items in home page is increased
    When    user add item to wishlist
    Then    wishlist notification success is visible
    And     user get the number of wishlist items after adding item
    Then    the number of wishlist increased


  Scenario: added items are displayed on wishlist
    When    user add item to wishlist
    Then    wishlist notification success is visible
    And     user get the number of wishlist items after adding item
    And     user go to wishlist page
    Then    the number of items greater than zero in wishlist page
