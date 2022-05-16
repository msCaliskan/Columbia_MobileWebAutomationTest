Feature: Mobile | Search User searchs for a product

  @smoke
  Scenario: User searchs for a product

    And The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user fills "bot" in the searchbox and click
    And The user verifies redirected to "/tum-urunler?searchValue=bot" page
    Then The user should see all search results match with "bot"
