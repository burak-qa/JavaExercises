package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTestMethodu {

    WebDriver driver;

    @Test
    public void test01(){

        //amazon.com'a gidelm ve Title'in "amazon" icerdigini test edelim
           driver.get("https://www.amazon.com");

           String actualTitle= driver.getTitle();
           String searchWord="amazon";

           if(actualTitle.contains(searchWord)){
               System.out.println("amazon testi PASSED");
           }else{
               System.out.println(("amazon testi FAILED"));
           }

           /*
           * Assert.assertTrue(actualTitle.contains(searchWord));*/ //bunu sonra ogrenecegiz

    }
    @Test
    public void test02() {

        //google'a gidelim ve basligin "google" icerdigini test edelim
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Ik ga akkoord']")).click();
        String actualSayfaTitle=driver.getTitle();
        String searchWord="Google";

    }
    @Before
    public  void editSettings(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void ortaligiTopla(){

    }
}
