package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04_Screenshot extends TestBase {

    @Test
    public void screenTest() throws InterruptedException, IOException {
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Ik ga akkoord']")).click();
        //1. adim: screenshot almak icin obje olusturalim ve deger olarak driver'imzi atayalim
        //deger olarak driver'i kabul etmesi icin casting yapmamiz gerekir
        TakesScreenshot takeSs=(TakesScreenshot) driver;

        //2. adim: tum sayfanin screenshot'ini almak icin bir file olusturalim ve
        //dosya yolunu belirtelim

        File allPageSs=new File("src\\allPage.png");

        //3.adim: olusturdugumuz file ile takescreenshot objesini iliskilendirelim

        allPageSs=takeSs.getScreenshotAs(OutputType.FILE);

        //eger spesific bir web elementin screenshot'ini almak istiyorsaniz

    }
}
