Feature: Hatali Senaryo

  Scenario: Kitapyurdu giris steps
    Given kitapyurdu sayfasına gidilir
    When Giris yap tikla.
    And eposta gir
    And  sifre gir
    And  giris butona tikla
    Then  giris yapıldığını kontrol et
    And isCookies
    And Anasayfaya Don

  Scenario: Ayın yayın Evlerinide Filtreleme Yapmak
    When Ayın Yayın eklerınen random biri seçilir1
    And Fiyat filtrelemesi yapılır ve Güncelle Tıklanır1
    Then fiyat kontrolu


