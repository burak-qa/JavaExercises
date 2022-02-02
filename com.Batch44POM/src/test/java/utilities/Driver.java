package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    //Driver class'i sayesinde bizim eski driver was killed!!
    //artik driver'a ihtiyac varsa Driver.getDriver() yazacagiz

        public static WebDriver driver;

        public static WebDriver getDriver(){
            WebDriverManager.chromedriver().setup();
            if (driver==null){                  //bu if sayesinde kod calisirken bir kere new keyword le driver olusturunca
                                                //diger kullanimlarda new devreye girmeyecek
                driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            return driver;


        }
        public static void closeDriver(){
            if(driver!=null){
                driver.quit();
                driver=null;
            }
        }
    }

