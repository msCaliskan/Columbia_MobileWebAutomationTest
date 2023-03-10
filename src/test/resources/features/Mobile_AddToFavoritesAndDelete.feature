Feature: Mobile | Add to favorites and delete
  @smoke
  Scenario: The user can add to favorites and delete

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks login button
    And The user clicks Giris Yap button
    And The user enters valid credentials
    And The user clicks hamburger menu button
    And The user navigates to "Erkek" "Yeni Gelenler" category
    And The user verifies redirected to "/erkek-yeni-gelenler" page
    And The user clicks any product
    And The user clicks hearth button
    And The user clicks login button
    And The user clicks arrow button
    Then The user clicks "Favorilerim" button
    And The user verifies redirected to "/account/favorites" page
    When The user clicks hearth button
    And The user verifies "Favori ürün bulunmamaktadır." message
    And The user clicks hamburger menu button
    Then The user clicks Çıkış button
    And The user verifies redirected to "/?logout=true" page
