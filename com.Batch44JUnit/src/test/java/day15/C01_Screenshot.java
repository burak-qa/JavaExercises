package day15;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C01_Screenshot extends TestBase {

    @Test
    public void nuttellaTest() throws IOException, InterruptedException {
        //amazon anasayfaya gidelim
        driver.get("https://www.amazon.com");
        //nutella icin arama yapalim
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclarin nuttella icerdigini test edelim
        WebElement resultNumberElement=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));

        String resultNumberStr=resultNumberElement.getText();
        Assert.assertTrue(resultNumberStr.contains("Nutella"));
        //testin calistiginin ispati icin tum sayfanin screenshot'unu alalim

        //tum sayfa screenshot icin 4 adim gerekli
        //1.adim icin TakeScreenShot objesi olusturma
        TakesScreenshot tss=(TakesScreenshot) driver;
        //2. adim kaydedecegimiz dosyayi olusturalim
        File allPageSS=new File ("target/screenShot/allpage.png");

        //3. adim bir dosya daha olusturup screenshot objesi ile screenshot'i alalim

        File fakePicture=tss.getScreenshotAs(OutputType.FILE);

        //4. adim gecici resmi kayit etmek istedigimiz asil dosya ya copy yapalim
        FileUtils.copyFile(fakePicture, allPageSS);


        Thread.sleep(5000);
    }
}
