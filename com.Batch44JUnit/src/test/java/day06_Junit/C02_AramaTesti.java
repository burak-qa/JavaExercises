package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AramaTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
        //2. Username kutusuna “standard_user” yazdirin
        WebElement usernameBox=driver.findElement(By.xpath("//input[@placeholder='Username']"));
        usernameBox.sendKeys("standard_user");
        //3. Password kutusuna “secret_sauce” yazdirin
        WebElement passwordBox=driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBox.sendKeys("secret_sauce");
        //4. Login tusuna basin
        WebElement clickButton = driver.findElement(By.xpath("//input[@name='login-button']"));
        clickButton.click();

        //5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement firstProducName= driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        String firstProduct=firstProducName.getText();
        firstProducName.click();
        //6. Add to Cart butonuna basin
        WebElement addToCartButton= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCartButton.click();
        //7. Alisveris sepetine tiklayin
        WebElement alisverisSepetiButonu= driver.findElement(By.className("shopping_cart_link"));
        alisverisSepetiButonu.click();
        //8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement kontrolKismi= driver.findElement(By.className("inventory_item_name"));
        String sepettekiUrunIsmi=kontrolKismi.getText();

        if (sepettekiUrunIsmi.equals(firstProduct)){
            System.out.println("Urun basarili sekilde sepete eklendi test PASS");
        }else {
            System.out.println("Urun basarili sekilde sepete eklenmedi test FAILED");
        }
        //9. Sayfayi kapatin
        driver.close();
    }
}
