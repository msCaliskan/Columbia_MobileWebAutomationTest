Feature: Mobile | Footer links are addressed correctly or not?

  @smoke
  Scenario Outline: Footer links validation

    Given The user visits Columbia homepage
    And The user verifies redirected to homepage
    And The user clicks "<Links>" and verifies "<Title>"

    Examples:
      | Links                                                  | Title                                                  |
      | Tough Mother Outdoor Rehberi                           | Outdoor Rehberi                                        |
      | Tarihçe                                                | Columbia Türkiye Online Shop                           |
      | Dünyada Columbia'dan Haberler                          | Columbia Sportswear Company                            |
      | Aktiviteye Göre                                        | Doğa Sporu Kıyafetleri, Montları ve Ayakkabıları       |
      | Beden Kılavuzu                                         | Beden Tablosu                                          |
      | Columbia Teknolojileri                                 | Columbia Teknolojileri                                 |
      | İşlem Rehberi                                          | İşlem Rehberi                                          |
      | Mağazadan Teslim                                       | Mağazadan Teslimat                                     |