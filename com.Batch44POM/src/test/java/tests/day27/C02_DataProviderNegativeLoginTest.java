package tests.day27;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTest {

    @DataProvider
    public static Object[][] wrongUserList() {
        String liste[][]={{"manager11","manger11"},{"manager12", "manager12"},{"manager13","manger13"}};
        return liste;
    }

    @Test(dataProvider= "wrongUserList")
    public void yanlisSifreUsernameTesti(String wrongUsername, String wrongPassword){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(wrongUsername);
        hotelMyCampPage.passwordBox.sendKeys(wrongPassword);
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.didnotEntryElement.isDisplayed());
        Driver.closeDriver();
    }
}
