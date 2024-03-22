Kitapyurdu Sitesi İçin Test Otomasyon
Java Maven Cucumber ile geliştirildi.
Normal Akış Senaryomuz;
Kullanıcı girişi yapar.
Bazı Bilgilerini ekler.
Bazı İlgi alanlarını ekler.
Search box kullanarak bir ürün aratır ve o ürünü sepete ekler. Eğer ürün kargo fiyatını karşılamaz ise rastgele bir ürün daha ekler.
Sepete gider ve ürünü kontrol ettikten sonra Siler. 
Anasayfadaki Ayın Yayınevlerinde random birine gider.
Oradaki ürünlere 100 TL ile 200 TL arasında filtreleme yapar.
Filtrelemeyi Kontrol eder . Hata var ise adımı hatalı sayar.(Mevcut bir hata bulundu)
O Ürünü seçer ve alt taraftaki yanındaki ile beraber bir ürün seç yapar ve random yanında bir ürün seçer.
Sepete gider ve 2 ürün olduğunu kontrol eder. 
Kontrol doğru ise Ürünleri siler ve Anasayfaya döner.
Ana sayfadan Random bir ürünü Favorilere ekler.
Anasayfadan Random bir ürünü sepete ekler
Favorilere gider ve Favoriye eklediği Ürünü Sepete ekler.
Sepetteki ürünleri Siler ve Anasayfaya Gider.
--Hata Bulundu--
Normal Sayfalarda Ürün Fiyat filtrelemesi yapılırken Sorun yok.
Fakat Anasayfadaki , Ayın Yayınevlerine Herhangi birisine tıklandığında Ürün Fiyat filtreleri yapıldığında Filtreleme doğru çalışmamaktadır.
Bunun Sebebi Ürünlerin 2 İndirimli ve indirimsiz fiyat olarak 2 verisinin olmasıdır. Filtreleme Ana fiyat üzerinden Filtrelemeyi yapmaktadır.
Bu yüzden Filtemelemede hata bulunmaktadır.

