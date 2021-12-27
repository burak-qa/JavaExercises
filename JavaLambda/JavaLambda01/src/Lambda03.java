import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>(Arrays.asList("mehmet", "emre", "yildix","emine","kader","ali","veli","veli","emre", "wabuziddin"));
        bykHrfTekrarsizSira(list);
        System.out.println();
        System.out.println("   ****   ");
        karakterSayisiTekrarsizTersirali(list);
        System.out.println();
        System.out.println("   ****   ");
        karakterSayisiSiraliEl(list);
        System.out.println();
        System.out.println("   ****   ");
        sonHarfTersSiraliEl(list);
        System.out.println();
        System.out.println("   ****   ");
        ciftKareTekrarsizTersSira(list);
        System.out.println();
        System.out.println("   ****   ");
        harfSayisi7Kontrol(list);
        System.out.println();
        System.out.println("   ****   ");
        wBaslamaKontrol(list);
        System.out.println();
        System.out.println("   ****   ");
        xBitmeKontrol(list);
        System.out.println();
        System.out.println("   ****   ");
        karakteriBuyukEl(list);
    }

    //List elemanlarini alfabetik buyuk harf ve  tekrarsiz yazdiriniz
    public static void bykHrfTekrarsizSira(List<String> list){
        list.stream().// akisa girdi
                map(String::toUpperCase).//elemanlar byk hafr update edildi
                sorted().//alfabetik sira
                distinct().//tekrarsiz yapildi
                forEach(t->System.out.print(t + " "));//yazdirildi //burada parametre String
    }

    //list elemanlarinin character sayisini ters sirali olarak tekrarsiz yazdiriniz
    public static void karakterSayisiTekrarsizTersirali(List<String> list){
        list.
                stream().
                map(t->t.length()). //String data character sayisina update edildi
                sorted(Comparator.reverseOrder()).//ters sira
                distinct().//tekrarsiz
                forEach(Lambda01::printEl);//yazdirildi //burada printnl calismaz Parametre Integer
    }

   // List elemanlarini character sayisina gore kucukten buyuge dogru yazdiriniz
    public static void karakterSayisiSiraliEl(List<String> list){
        list.stream().
                sorted(Comparator.comparing(t->t.length())). //sirala - karsilastir
                forEach(t->System.out.print(t + " "));
    }
    //list elemanlarini son harfine gore ters sirali yazdiriniz
    public static void sonHarfTersSiraliEl(List<String> list){
        list.  //isim
                stream(). //karsilastirma methodlarinin oldg. class
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).//elemanin son index e karsilik gelen karakterini alir
                        reversed()). //son index in karakterini ters siralar z-a
                forEach(t-> System.out.print(t + " "));
    }
    //listin elemanlarinin  karakterlerinin Cift sayili karelerini hesaplayan, tekrarsiz  buyukten kucuge sirali yaziniz.
   public static void ciftKareTekrarsizTersSira(List<String> list){
        list.stream().
                map(t->t.length()*t.length()).//string elemanlar character sayisina cevirildi
                filter(Lambda01::ciftBul).//cift sarti calisti
                distinct().//tekrarsiz
                sorted(Comparator.reverseOrder()).//ters sira b->k
                forEach(Lambda01::printEl);//yazdirilis
   }
   //List elemanlarinin karakter sayisini 7 ve 7 den az olma durumunu kontrol ediniz
    public static void harfSayisi7Kontrol(List<String> list){
     //  boolean kontrol=list.
      //         stream().
       //        allMatch(t->t.length()<=7);//her bir elemani harf sayisini <=7 ye eslesmesine bakti
     //   if (kontrol){
      //      System.out.println("List elemanlari 7 harfden buyuk degil");
     //   }else{
     //       System.out.println("Agam list elemanlari 7 harfden BUYUK");
      //  }
        //System.out.println(kontrol);
        System.out.println(list.stream().allMatch(t->t.length()<=7)?"List elemanlari 7 harfden buyuk degil":"Agam list elemanlari 7 harfden BUYUK"); //iste bu LAMBDA
     //allMatch her bir elemani harf sayisini <=7 ye eslestirmesine bakti
    }
    //List elemanlerinin "W" ile baslamasini kontrol ediniz
    public static void wBaslamaKontrol(List<String> list){
        System.out.println(list.
                stream().
                noneMatch(t->t.startsWith("w"))? "w ile baslayan isim kimse ayaga kalksin" : "Agam w ile baslayan isim mi oluuuuur");
    }
    //List elemanlerinin "x" ile biten en az bir elemani kontrol ediniz
    public static void xBitmeKontrol(List<String> list){
        System.out.println(list.
                stream().
                anyMatch(t->t.endsWith("x"))? "x ile biten isim kimse ayaga kalksin" : "Agam x ile biten isim mi oluuuuur");
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder.
        //allMatch() --> tum elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
        //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir sarti SAGLARSA false return eder.
    }
    //Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakteriBuyukEl(List<String> list){
        System.out.println(list.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).//lenght karakter uzunluguna gore siraladi k->b
                        reversed()).//ters siraladi b->k
                findFirst());//ilk elemani aldi
    }
}
