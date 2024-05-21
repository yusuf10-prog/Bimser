

@Bimser
  Feature: US0001 Kullanici Bimser anasayfasinda test yapar.

    Scenario:  TC01 Kullanici anasayfa ekranında yer alan üst alanlarin kontrolunu yapar.

      Given Kullanici "bimserUrl" adresi ile anasayfaya gider
      And Telefon numarasini arama alanina tiklar.
      And FaceTime acilsin mi? alaninda iptal butonuna tiklar.
      And mail adresine tiklar. Mail adresinin acildigi alanda cik butonuna tiklar.
      And Facebook ikonuna tiklar. Facebook sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.
      And X ikonuna tiklar. X sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.
      And Youtube ikonuna tiklanir. Youtube sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.
      And Linkedin ikonuna tiklanir. Linkedin sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.
      And Instagram ikonuna tiklanir. Instagram sayfasina gecis yaptiktan sonra tekrar Bimser sayfasina geri donulur.
      And sayfayi kapatir.

