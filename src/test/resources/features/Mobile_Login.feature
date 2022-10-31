@smoke
Feature: Mobile | Login with valid and invalid credentials

  Background:

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks login button
    And The user clicks Giris Yap button

  Scenario: Login with valid credentials
    And The user enters valid credentials for mobile
    And The user clicks login button
    And The user verifies redirected to "/account/info" page
    And The user checks "Musa", "Caliskan", "musainveonn@gmail.com" and "0(553) 570 66 80" informations
    And The user clicks hamburger menu button
    And The user clicks Çıkış button
    And The user verifies redirected to "/?logout=true" page

  Scenario: The user must not be able to login with invalid email
    And The user enters invalid email for mobile
    And The user verifies "E-posta adresiniz ve/veya şifreniz hatalıdır." message

  Scenario: The user must not be able to login with invalid password
    And The user enters invalid password for mobile
    And The user verifies "E-posta adresiniz ve/veya şifreniz hatalıdır." message