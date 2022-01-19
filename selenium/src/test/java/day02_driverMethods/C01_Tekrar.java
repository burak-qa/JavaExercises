package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //Normalde selenium'un kendi IDE'si var fakat biz daha kullanisli oldugu icin intellJ kullaniyoruz
    //inteliJ'de yeni bir proje actigimizda oncelikle selenium kutuphanelerini projeye eklememz gerekir
    //biz en ilkel proje kutuphaneleri jar dosyalari olarak yukledik
    //bu ekledigimiz dosyalar ile artiik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        //setProperty method'u 2 parametre ister
        //ilki kullanacagimiz browser'a ait driver
        //ikinci parametre ise selenum itesinden indirip projemize ekledigimiz chromegriver'in path'i
        //windiws kullanicilari sona .exe eklerken, apple kullananlar .exe eklememeli

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
    Thread.sleep(5000);
    //java'dan geliir, icine yazilan milisaniye kadar kodlarin calismasini durdurur

        driver.close();
        //driver.close class'in sonuna yazilir. Cunku bu kod calisinca driver'imiz kapanir
        //bu koddan sonra yeniden bir browser acmak istiyorsak driverá yeni deger atamaliyiz



    }

}
