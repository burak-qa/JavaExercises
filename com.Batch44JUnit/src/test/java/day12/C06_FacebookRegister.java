package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_FacebookRegister extends TestBase {
    //Yeni bir class olusturalim:
    @Test
    public void test01() throws InterruptedException {
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Alle cookies toestaan']")).click();
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim

        WebElement nameBox=driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions actions=new Actions(driver);

        actions.click(nameBox)
                .sendKeys("Burak")
                .sendKeys(Keys.TAB)
                .sendKeys("Sari")
                .sendKeys(Keys.TAB)
                .sendKeys("abc@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("abc123")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("30")
                .sendKeys(Keys.TAB)
                .sendKeys("Jan")
                .sendKeys(Keys.TAB)
                .sendKeys("1980")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(5000);

        //4- Kaydol tusuna basalim

    }
}
