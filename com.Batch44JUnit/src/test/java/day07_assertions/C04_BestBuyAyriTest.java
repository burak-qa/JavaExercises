package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BestBuyAyriTest {
    static WebDriver driver;
    @Before
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void urlTesti(){
        //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String actualURL=driver.getCurrentUrl();
        String expectedURL="https://www.bestbuy.com/";
        Assert.assertEquals("Lutfen test degerlerini gozden gecirin",expectedURL,actualURL);
    }
    @Test
    public void titleTesti(){
        //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        String actualTitle=driver.getTitle();
        String istenmeyenKelime="Rest";
        Assert.assertFalse(actualTitle.contains(istenmeyenKelime));
    }
    @Test
    public void logoTesti(){
        //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi=driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue("Logo gorunmuyor",logoElementi.isDisplayed());
    }
    @Test
    public void francaisTesti(){
        //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement francais= driver.findElement(By.xpath("//button[text()='Français']"));
        Assert.assertTrue(francais.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.close();
        }
    }

