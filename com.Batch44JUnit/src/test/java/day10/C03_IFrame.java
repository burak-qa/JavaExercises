package day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_IFrame {
    //● Bir class olusturun: IframeTest
    //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
    //   ● Bir metod olusturun: iframeTest
    //        ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda    yazdirin.
    //        ○ Text Box’a “Merhaba Dunya!” yazin.
    //        ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu     dogrulayin ve  konsolda yazdirin.
    //Collapse
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        @Test
        public void iFrameTest(){
            driver.get("https://the-internet.herokuapp.com/iframe");

            WebElement IsteneneYaziElement= driver.findElement(By.tagName("h3"));
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(IsteneneYaziElement.isEnabled(), "Iframe yazisi gorunmuyor");
            System.out.println(IsteneneYaziElement.getText());


            //yazi yazmak istedigimiz text kutusu iframe'in icinde oldugundan direk ulasamiyoruz
            //once iframe'i locate edip, onun icine switch yapmaliyiz
            WebElement iFrame=driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(iFrame);

            WebElement textBox = driver.findElement(By.tagName("p"));
            textBox.clear();
            textBox.sendKeys("Merhaba Dunya!");

            //      ○ TextBox’in altinda bulunan “Elemental Selenium” linkini tiklayin
            // yukarida iframe'in icine switch yaptigimizdan, yeniden disari cikmak istedigimizde
            // ana sayfaya donmeliyiz
            driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

            //  yeni sayfada "Sponsored by Sauce Labs"    textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.
            // sponsored yazisi yeni sayfada oldugundan ve driver eski sayfada kaldigindan
            // yaziyi locate edemedik.....
            WebElement sponsoredYazisiElementi=driver.findElement(By.xpath("//p[text()='Sponsored by ']"));
            softAssert.assertTrue(sponsoredYazisiElementi.isDisplayed(),"Sponsored yazisi gorunmuyor");
            softAssert.assertAll();
        }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
