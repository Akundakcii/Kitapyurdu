Feature: Kitap yurdu Sayfası

  Scenario: Kitapyurdu giris steps
    Given kitapyurdu sayfasına gidilir
    When Giris yap tikla.
    And eposta gir
    And  sifre gir
    And  giris butona tikla
    Then  giris yapıldığını kontrol et
    And isCookies
    And Anasayfaya Don


  Scenario:Uyelik Bilgileri
    When uye isiminin üstüne gel
    And hesabına tikla
    Then giris yapıldığını kontrol et
    And hesap bilgilerine tikla
    And resim ekle
    And takma ad koy
    And dogumgunu sec
    And Tel no yaz
    And güncelleye tikla
    Then hesap güncellendi yazsını kontrol et
    And Anasayfaya Don


  Scenario: Bülten Seçme
    When uye isiminin üstüne gel
    And hesabına tikla
    Then giris yapıldığını kontrol et
    And bultene tikla
    And bülten veri seç
    And verileri güncelle
    Then güncellendiğini kontrol et
    And Anasayfaya Don

  Scenario: Searchbox ta arama yapmak
    When SearchBox bir ürün yaz
    And Arama butonuna tıkla
    Then Arama yapıldığına kontrol et
    And Filtreden dil seceniği ekle
    And ilk iki ürünü sepete ekle
    Then Sepete eklenen ürünü kontrolünü yap
    And Sepete tıkla ve git
    And Sepet tutarı yüz tl değil ise yeni bir kitap ekle
    And Sepete git ve ürünleri sil
    And Anasayfaya Don

  Scenario: Ayın yayın Evlerinide Filtreleme Yapmak
    When Ayın Yayın eklerınen random biri seçilir
    And Fiyat filtrelemesi yapılır ve Güncelle Tıklanır
    And birtane kitap seçilir
    And Çoklu Tekliften birtanesi seçilir
    And Kitap için yorum yapılır ve yıldız verilir
    And Sepete tıkla ve git
    And Sepete git ve ürünleri sil
    And Anasayfaya Don


  Scenario: Anasayfadaki random ürünleri Favroiye eklemek ve Favorilerden Ürün satın almak
    When bir ile otuz arasında bir sayı üret ve o ürünü fav ekle
    And alisveris sepetine bir urun ekleme
    And favorileri gidilir
    And favorideki urunler sepete eklenir
    And Sepete tıkla ve git
    And Sepete git ve ürünleri sil
    And Anasayfaya Don













