package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_ScreenshotWebelement extends TestBase {
    @Test
    public void nuttellaTest() throws IOException, InterruptedException {
        //amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        //nutella icin arama yapalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);

        // sonuclarin nuttella icerdigini test edelim
        WebElement resultWriteElement = driver.findElement(By.xpath("//div[@class='sg-col-inner']"));

        String resultNumberStr = resultWriteElement.getText();
        Assert.assertTrue(resultNumberStr.contains("Nutella"));
        //testin calistiginin ispati icin sonuc yazisi webelementnin screenshot'unu alalim

        //tum sayfa screenshot icin 4 adim gerekli
        //1.adim Screenshot cekecegimiz webelementi locate edelim
        TakesScreenshot tss = (TakesScreenshot) driver;
        //2. adim  screenshot'i kaydedecegimiz dosya olusturalim

         File webelementSS=new File("target/screenShot/webelement.png");
        //3. adim

        File fakePicture=resultWriteElement.getScreenshotAs(OutputType.FILE);

        //4. adim gecici resmi kayit etmek istedigimiz asil dosya ya copy yapalim
        FileUtils.copyFile(fakePicture, webelementSS);


        Thread.sleep(5000);
    }
}