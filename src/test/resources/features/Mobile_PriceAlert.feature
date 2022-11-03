Feature: Mobile | Price Alert

  @smoke
  Scenario: The user can select to PriceAlert and delete

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks login button
    And The user clicks Giris Yap button
    And The user enters valid credentials
    And The user clicks hamburger menu button
    And The user navigates to "Erkek" "Yeni Gelenler" category
    And The user verifies redirected to "/erkek-yeni-gelenler" page
    And The user clicks any product
    Then The user clicks " Fiyatı Düşünce Haber Ver" button
    And The user enters valid price
    Then The user clicks "Kaydet" button
    And The user clicks login button
    And The user clicks arrow button
    Then The user clicks "Fiyat Alarmlarım" button
    And The user verifies redirected to "/account/priceSubscription" page
    And The user clicks "Sil" button
    And The user verifies "Fiyat alarmı bulunmamaktadır." message
    And The user clicks hamburger menu button
    Then The user clicks Çıkış button
    And The user verifies redirected to "/?logout=true" page
