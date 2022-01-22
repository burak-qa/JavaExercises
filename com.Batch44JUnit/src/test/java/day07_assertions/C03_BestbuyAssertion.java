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

public class C03_BestbuyAssertion {


    WebDriver driver;
    @Before
public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01(){
        // Bir class oluşturun: BestBuyAssertions
        //2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
        driver.get("https://www.bestbuy.com");
        //		○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String actualURL=driver.getCurrentUrl();
        String expectedURL="https://www.bestbuy.com";
        Assert.assertEquals("Please review test values",expectedURL, actualURL);



        //		○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

        String actualTitle=driver.getTitle();
        String unwantedWord="Rest";

        Assert.assertFalse(actualTitle.contains(unwantedWord));
        System.out.println("Bu satir calismaz");
        //		○ logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElement = driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue("Logo don't see",logoElement.isDisplayed());
        //		○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement francais=driver.findElement(By.xpath("//button[text()='Francais'"));
        Assert.assertTrue(francais.isDisplayed());
    }
    @After
    public void tearDown(){
        //driver.close();
    }
}
