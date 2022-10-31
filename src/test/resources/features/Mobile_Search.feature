Feature: Mobile | Search User searches for a product

  @smoke
  Scenario: User searches for a product

    And The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user fills "Mont" in the searchbox and click
    And The user verifies redirected to "/tum-urunler?searchValue=Mont" page
    Then The user should see all search results match with "Mont"
