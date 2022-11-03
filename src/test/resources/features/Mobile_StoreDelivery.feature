Feature: Mobile | Store Delivery

  @smoke
  Scenario:The user can pick up in store

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks login button
    And The user clicks Giris Yap button
    And The user enters valid credentials
    And The user clicks hamburger menu button
    And The user navigates to "Erkek" "Yeni Gelenler" category
    And The user verifies redirected to "/erkek-yeni-gelenler" page
    And The user clicks any product
    And The user chooses size
    And The user clicks "SİPARİŞİ TAMAMLA" button
    And The user verifies redirected to "/checkout" page
    And The user verifies "Kayıtlı adresiniz bulunmamaktadır." message
    And The user clicks "Yeni Adres Ekle" button
    When The user enters valid informations
    And The user clicks "Kaydet" button
    And The user closes popUp
    And The user clicks "Mağazadan Teslim Al" button
    And The user chooses store informations
    Then The user clicks "Fatura Adresi Adımına Geç" button
    And The user clicks "Ödeme Adımına Geç" button
    And The user enters invalid informations
    And The user selects 3D Secure, On Bilgilendirme and Mesafeli Satis Sozlesmesi buttons
    And The user clicks "Siparişi Tamamla" button
    And The user verifies "Kart numarası geçersizdir" message
    Then The user clicks Sepetim button
    And The user clicks "Sil" button
    And The user verifies message
    And The user clicks login button
    And The user clicks arrow button
    And The user clicks "Adreslerim" button
    And The user clicks "Sil" button
    And The user clicks "EVET" button
    And The user verifies "Teslimat adresi bulunmamaktadır." message
    And The user clicks hamburger menu button
    Then The user clicks Çıkış button
    And The user verifies redirected to "/?logout=true" page