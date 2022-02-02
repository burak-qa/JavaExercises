package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04_JsExecuterClick extends TestBase {
    //amazon anasayfaya gidip
    //sell linkine JSExecuter ile tiklayin
    //ilgil sayfaya gittigimizi test edelim

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.amazon.com");
        //1. adim JsExecuter objesi olusturalim ve driver'i cast edelim

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        //2. adim ilgili web elementi locate edelim

        WebElement selElement=driver.findElement(By.xpath("//a[normalize-space()='Sell']"));

        //3. adim ilgili script ve argument (bizim web elementimiz) ile objemiz uzerinden
        //executeScript method'unu calistiralim

        jse.executeScript("arguments[0].click;", selElement);
        Thread.sleep(5000);
    }
}
