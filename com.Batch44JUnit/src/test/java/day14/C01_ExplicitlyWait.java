package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C01_ExplicitlyWait extends TestBase {
    //1. Bir class olusturun : WaitTest
    //2. Iki tane metod olusturun : implicitWait() , explicitWait()
    //     Iki metod icin de asagidaki adimlari test edin.






    @Test
    public void implicitWaitTest() throws InterruptedException {
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        driver.findElement(By.xpath("//button[.='Remove']")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.

        WebElement itsGoneElement =driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        Assert.assertTrue(itsGoneElement.isDisplayed());
        Thread.sleep(3000);

        //6. Add buttonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        //7. It’s back mesajinin gorundugunu test edin
    WebElement itsBackElement = driver.findElement(By.xpath("//p[text()=\"it's back!\"]"));
    Assert.assertTrue(itsBackElement.isDisplayed());
    Thread.sleep(3000);

    }

    @Test
    public void explicitlyWaitTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
// explicitly wait kullanabilmek icin once wait objesi olusturmaliyiz
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        //4. Remove butonuna basin.
        driver.findElement(By.xpath("//button[.='Remove']")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        /*
        WebElement itsGoneElement =driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        wait.until(ExpectedCondition.visibilityOf(itsGoneElement));
        her ne kadar kodun anlasilabilir olmasi icin once locate edelim sonra
        bekleyelim yaklasimi daha guzel gorunse de
        web element zaten gorunur olmadigindan locate etmemiz de mumkun olmayacaktir
        bu durumda locate ve bekleme islemini beraber yapmak gerekir
         */

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's gone!\"]")));
        WebElement itsGoneElement =driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        Assert.assertTrue(itsGoneElement.isDisplayed());
        Thread.sleep(3000);
        //6. Add buttonuna basin
        driver.findElement(By.xpath("//button[text()='Add']")).click();

        //7. It’s back mesajinin gorundugunu test edin
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's back!\"]")));
        WebElement itsBackElementi=driver.findElement(By.xpath("//p[text()=\"It's back!\"]"));
        Assert.assertTrue(itsBackElementi.isDisplayed());

    }
}
