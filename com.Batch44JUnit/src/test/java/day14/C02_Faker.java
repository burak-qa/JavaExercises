package day14;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_Faker extends TestBase {
    @Test
    public void facebookKayitTesti() throws InterruptedException {
        //"https://facebook.com"  Adresine gidin
        driver.get("https://facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Alle cookies toestaan']")).click();

        //“create new account”  butonuna basin
        driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button']")).click();
        //“firstName” giris kutusuna bir isim yazin

        WebElement nameBox=driver.findElement(By.xpath("//input[@name='firstname']"));

        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();

        actions.click(nameBox)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)




        //“surname” giris kutusuna bir soyisim yazin
                .sendKeys(faker.name().lastName())
        //“email” giris kutusuna bir email yazin
                .sendKeys(Keys.TAB)
                .sendKeys(email)
        //“email” onay kutusuna emaili tekrar yazin
                .sendKeys(Keys.TAB)
                .sendKeys(email)
        //Bir sifre girin
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
        //Tarih icin gun secin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)

                .sendKeys("30")

        //Tarih icin ay secin
                .sendKeys("Jan")
                .sendKeys(Keys.TAB)
        //Tarih icin yil secin
                .sendKeys(Keys.TAB)
                .sendKeys("1980")
        //Cinsiyeti secin
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .perform();
        //Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.

        WebElement manChooseElement =driver.findElement(By.xpath("//input[@value='2']"));
        WebElement womanChooseElement =driver.findElement(By.xpath("//input[@value='1']"));

        Assert.assertTrue(manChooseElement.isSelected());
        Assert.assertFalse(womanChooseElement.isSelected());
        Thread.sleep(5000);
        //Sayfayi kapatin
    }
}
