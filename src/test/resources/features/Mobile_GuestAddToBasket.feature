Feature: Mobile | Guest add to basket

  @smoke
  Scenario:Guest add to basket and delete product from basket

    And The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks hamburger menu button
    And The user navigates to "Erkek" "Yeni Gelenler" category
    And The user verifies redirected to "/erkek-yeni-gelenler" page
    And The user clicks any product
    And The user chooses size
    And The user clicks "SİPARİŞİ TAMAMLA" button
    And The user verifies redirected to "/checkout" page
    And The user clicks "Yeni Adres Ekle" button
    When The user enters valid informations for guest
    And The user clicks "Kaydet" button
    And The user closes popUp
    And The user clicks "Ödeme Adımına Geç" button
    And The user enters invalid informations
    And The user selects 3D Secure, On Bilgilendirme and Mesafeli Satis Sozlesmesi buttons
    And The user clicks "Siparişi Tamamla" button
    And The user verifies "Kart numarası geçersizdir" message
    Then The user clicks Sepetim button
    And The user clicks "Sil" button
    And The user verifies message
