Feature: Mobile | Add to basket

 @smoke
  Scenario:Add to basket and delete product from basket

  Given The user visits Columbia homepage
  And The user verifies redirected to homepage
  And The user clicks login button
  And The user clicks Giris Yap button
  And The user enters valid credentials for mobile
  And The user clicks hamburger menu button
  And The user navigates to "Erkek" "Ayakkabı" category for mobile
  And The user clicks anyone product
  And The user chooses color and size
  And The user clicks "SEPETE GÖZAT" button
  And The user verifies redirected to "/basket" page
  When The user clicks "Sonraki Adım" button
  And The user verifies redirected to "/checkout" page
  And The user verifies "Kayıtlı adresiniz bulunmamaktadır." message
  And The user clicks "Yeni Adres Ekle" button
  When The user enters valid informations
  And The user clicks "Kaydet" button
  And The user clicks "Ödeme Adımına Geç" button
  And The user enters invalid informations
  And The user selects 3D Secure, Ön Bilgilendirme and Mesafeli Satış Sözleşmesi buttons for mobile
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
  And The user verifies redirected to homepage