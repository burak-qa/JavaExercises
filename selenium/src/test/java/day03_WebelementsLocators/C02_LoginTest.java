package day03_WebelementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sing in butonuna basin
        WebElement signInLnk=driver.findElement(By.id("sign-in")); //sadece locate edip bir variable'a assign ettik
        signInLnk.click();
        //c. email textbox, password textbox, and signin button elementlerini locate ediniz..
        WebElement emailtextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        //d. Kullanici adni ve sifreyi asagiya girin ve oturum ac (sign in) buttonina tiklayin:
        //      i. Username: testtechproed@gmail.com
        //      ii.Password: Test1234!
        emailtextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");

        Thread.sleep(3000);
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verfy).

        WebElement enterWriteElement=driver.findElement(By.tagName("h1"));
        System.out.println(enterWriteElement.getText());
        String actualEnterWrite=enterWriteElement.getText();
        String expectedEnterWrite="Welcome to Address Book";

        if (actualEnterWrite.equals(expectedEnterWrite)){
            System.out.println("Sayfaya girs testi PASS");
        }else{
            System.out.println("sayfaya giris testi FAILED");
        }
        //f. "Addresses"ve "Sign Out"textlerinin goruntulendigini (displayes) dogrulayin(verify).
        WebElement adressWebElement=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElement=driver.findElement(By.linkText("Sign out"));

        System.out.println(adressWebElement.isDisplayed());

        if(adressWebElement.isDisplayed()){
            System.out.println("Adress elementi goruntuleme testi PASS");
        }else{
            System.out.println("Adress elementi goruntuleme testi FAILED");
        }
        if(signOutElement.isDisplayed()){
            System.out.println("SignOut elementi goruntuleme testi PASS");
        }else{
            System.out.println("SignOut elementi goruntuleme testi FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.

        List<WebElement> linksList=driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linksList.size()+ " adet link bulunmaktadir");

        driver.close();
    }
}
