package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin
        driver.get("https://ww.google.com");
        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//div[text()='Ik ga akkoord']")).click(); //kabul et tusunun kodu
        //4-Sayfa basliginin “Google” ifadesi icerdigini test edin
        String actualSayfaTitle=driver.getTitle();
        String arananKelime="Google";

        if (actualSayfaTitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }
        //5- Arama cubuguna “Nutella” yazip aratin
        WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("Nuttella" + Keys.ENTER);

        //6-Bulunan sonuc sayisini yazdirin

        WebElement endNumberElement= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println(endNumberElement.getText());
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String endNumberString=endNumberElement.getText();
        String endWord[] = endNumberString.split("");
        String endNuttellaNumberString = endWord[1]; //73.900.000
        endNuttellaNumberString= endNuttellaNumberString.replace(".","");

       int nuttellaSearchResult=Integer.parseInt(endNuttellaNumberString);

       if(nuttellaSearchResult>10000000){
           System.out.println("Nuttella arama testi PASSES");
       }else{
           System.out.println("Nuttela arama testi FAILED");
       }
        //8-Sayfayi kapatin
    }
}
