package day07_assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CheckBox {

    WebDriver driver;


    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01() throws InterruptedException {
        //a. Verilen web sayfasına gidin.  //https://theinternet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1=driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox 2']"));


        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        Thread.sleep(3000);
        //d. Checkbox2 seçili değilse onay kutusunu tıklayın

    }

    @After
    public void tearDown() {

    }
}
