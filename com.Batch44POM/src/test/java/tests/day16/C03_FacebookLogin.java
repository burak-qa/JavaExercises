package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {


    @Test
    public void test01() throws InterruptedException {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookies.click();



        //2- POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin

        Faker faker=new Faker();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPage.passBox.sendKeys(faker.internet().password());
        facebookPage.loginButtonu.click();

        //4- Basarili giris yapilamadigini test edin

            Assert.assertTrue(facebookPage.errorWriteElement.isDisplayed());

        Thread.sleep(5000);
        Driver.closeDriver();


    }
}
