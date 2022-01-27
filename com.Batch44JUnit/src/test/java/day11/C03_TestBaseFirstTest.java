package day11;

import org.testng.annotations.Test;
import utilities.TestBase;


public class C03_TestBaseFirstTest extends TestBase { //yeni olusturdugumuz test classlarinda extends TestBase i unutmayacagiz


    @Test
    public void test01() {
        driver.get("https://www.amazon.com");
    }




}
