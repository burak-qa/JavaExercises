@parametreTest
Feature: US1003 parametre ile stepdefination olusturma

  Scenario:TC05_parametre kullanimi

    Given kullanici amazon sayfasina gider
    And  "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder
    And sayfayi kapatir