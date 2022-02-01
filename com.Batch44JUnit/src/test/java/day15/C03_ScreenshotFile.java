package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.IOException;

public class C03_ScreenshotFile extends TestBase {
    //amazona gidin
    //3 farkli test methodu ile java, nutella ve elma aratip
    //sonuc sayfasini screenshot'i kaydedin
    WebElement searchBox;

    @Test
    public void test01() throws IOException {

        driver.get("https://www.amazon.com");
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);
        allPageScreenshot();

    }

    @Test
    public void test02() throws IOException {

        driver.get("https://www.amazon.com");
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
         searchBox.clear();
        searchBox.sendKeys("java" + Keys.ENTER);
        allPageScreenshot();

    }
    @Test
    public void test03() throws IOException {

        driver.get("https://www.amazon.com");
        searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.sendKeys("apple" + Keys.ENTER);
        allPageScreenshot();
    }
}
