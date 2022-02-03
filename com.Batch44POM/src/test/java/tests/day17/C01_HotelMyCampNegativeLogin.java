package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMyCampNegativeLogin {
    //1 ) Bir Class olustur : NegativeTest
    //2) Bir test method olustur NegativeLoginTest()
    //         https://www. hotelmycamp.com/ adresine git
    //        login butonuna bas
    //    test data username: manager1 ,
    //    test data password : manager1!
    //    Degerleri girildiginde sayfaya girilemedigini test et

    @Test
    public void test01(){
        Driver.getDriver().get("https://www.hotelmycamp.com");

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();


        hotelMyCampPage.usernameBox.sendKeys("manager1");
        hotelMyCampPage.passwordBox.sendKeys("manager1!");
        hotelMyCampPage.loginButonu.click();

        Assert.assertTrue(hotelMyCampPage.didnotEntryElement.isDisplayed());
        Driver.closeDriver();

    }
}
