Feature: Mobile | Add new adress and delete

  @smoke
  Scenario: Add new adress and delete

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks login button
    And The user clicks "Giriş Yap" buttonn
    When The user enters valid credentials
    And The user clicks login button
    And The user clicks arrow button
    Then The user clicks "Adreslerim" button
    And The user verifies redirected to "/account/addresses" page
    And The user verifies "Teslimat adresi bulunmamaktadır." message
    When The user clicks "Yeni Adres Ekle" button
    And The user enters valid informations
    And The user clicks "Kaydet" button
    And The user clicks "Sil" button
    And  The user clicks "EVET" button
    And The user verifies "Teslimat adresi bulunmamaktadır." message
    Then The user clicks hamburger menu button
    And The user clicks Çıkış button
    And The user verifies redirected to "/?logout=true" page
