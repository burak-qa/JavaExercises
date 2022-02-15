package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class CrossDriver {
    //Driver class'i sayesinde bizim eski driver was killed!!
    //artik driver'a ihtiyac varsa Driver.getDriver() yazacagiz

    private CrossDriver(){

    }
    public static WebDriver driver;

    public static WebDriver getDriver(String browser){
        //buraya parametre olarak yazdigimiz bowser sayesinde coklu testler
        //calistirilirken arada CrossDriver'a yeni browser atamasi yapabilmemize
        //imkan tanimasi icindir
        browser = browser == null ? ConfigReader.getProperty("browser") : browser;

        if (driver==null){//bu if sayesinde kod calisirken bir kere new keyword le driver olusturunca
            //diger kullanimlarda new devreye girmeyecek
            switch(browser){

                case "chrome": //istegimiz arama motoru ile test edebiliriz con
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }
            //driver = new ChromeDriver();
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


