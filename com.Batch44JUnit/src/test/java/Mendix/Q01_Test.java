package Mendix;

import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q01_Test extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://localhost:8080/login.html?profile=Responsive");
        Thread.sleep(1000);

        WebElement nameBox = driver.findElement(By.id("usernameInput"));

        Actions actions=new Actions(driver);

        actions.click(nameBox)
                .sendKeys("MxAdmin")
                .sendKeys(Keys.TAB)
                .sendKeys("1")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//h4[@class='mx-text mx-name-text25 card-title spacing-outer-bottom-none']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn mx-button mx-name-actionButton2 btn-success']")).click();
        Thread.sleep(1000);

       //WebElement dateBox = driver.findElement(By.id("35.MyFirstModule.Flight_NewEdit.datePicker1.19_fbd_22"));

        Actions action=new Actions(driver);
        action.click()
                .sendKeys("1/14/2022")
                .sendKeys(Keys.TAB)
                .sendKeys("199.99")
                .sendKeys(Keys.TAB)
                .sendKeys("Antalya")
                .sendKeys(Keys.TAB)
                .sendKeys("Airbus")
                .sendKeys(Keys.TAB)
                .sendKeys("Ataturk")
                .sendKeys(Keys.TAB)
                .sendKeys("Tarik")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        Thread.sleep(5000);
    }
}
