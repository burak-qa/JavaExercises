package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class C01_WindowHandle {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void handleWindows() throws InterruptedException {
        driver.get("https://www.amazon.com");
        String windowHandleDegeri1=driver.getWindowHandle();
        System.out.println("ilk sayfanin window handle degeri : " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW); //yeni bir pencere acilir
        driver.get("https://www.bestbuy.com");
        System.out.println("2. sayfanin handle degeri : " + driver.getWindowHandle());
        String windowHandleDegeri2=driver.getWindowHandle();

        Set<String> handleDegerleriSet=driver.getWindowHandles();
        System.out.println(handleDegerleriSet);

        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

        Thread.sleep(3000);
        //amazon'un acik oldugu sayfaya gecin ve nuttella icin arama yapin

        driver.switchTo().window(windowHandleDegeri1);
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] "));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //bestbuy acik olan sayfaya gecin ve title'in bestbuy icerdigini test edin

        Thread.sleep(3000);
        driver.switchTo().window(windowHandleDegeri2);
        Assert.assertTrue(driver.getTitle().contains("Best Buy"));


        //facebook 'un acik oldugu sayfaya gecin
        // ve url'in https://www.facebook.com oldugunu test edin
        //eger acik olan pencelerden sadece bir tanesinin window ghandle degeri bilinmiyorsa
        //once tum handle degerlerin bulup bir set'e koyariz


        handleDegerleriSet=driver.getWindowHandles();

        //bu soru iicin su anda set'te 3 window handle degeri var
        //1. ve 2. sayfanin window handle degerlerini biliyoruz
        //setimizde olup, ilk iki sayfa olmayan handle degeri 3. sayfanin handle degeri alacaktir

        String windowHandleDegeri3="";
        for (String each: handleDegerleriSet
        ) {
            if (!(each.equals(windowHandleDegeri1) || each.equals(windowHandleDegeri2)) ){
                windowHandleDegeri3=each;
            }
        }
        System.out.println(windowHandleDegeri3);
        System.out.println(handleDegerleriSet);
        driver.switchTo().window(windowHandleDegeri3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
        Thread.sleep(5000);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }





}
    //1.Driver bizim elimiz, gozumuz gibidir. Onu nereye gonderirsek orda bizim adimiza istedigimiz islemleri yapar.
    //Ama bazen driver'i gonderdigimiz sayfa disina cikmamiz gerekebilir. (alert, iframe, tabs veya yeni pencere gibi..)
    //2.Driver'i gonderdigimiz sayfa disinda bir yerde islem yaptirmak istrersek driver.switchto().yeni ortam
    //3.switch.to() ile gittigimiz ortam alert ise
    //-Ok'e basmak icin .accept()
    //-cancel'e basmak icin .dismiss
    //-alert uzerinde var olan yaziyi almak icin .getText()
    //-alert'de varsa yazi gondermek icin .sendKeys() method'larina kullanabiliriz
    //4.switchTo() ile gittigimiz ortam iframe ise
    //-3 farkli yontem ile iframe'e grcis yapabiliriz
    //i- index
    //ii-id veya name(String)
    //iii-Webelement olarak gecis icin method kullanabiliriz
    //-bir defa iframe'e gecince tekrar o iframe'den cikmamiz gerekirse yine .switchTo() kullanmaliyiz
    //i-parentFrame : icinde oldugumuz iframe'den bir ust iframe'e cikar
    //ii- defaultContent : en ust seviyeye yani anasayfaya gecis yapar
    //eger sadece bir tane iframe varsa bu iki yontem ayni islemi yapmis olur
