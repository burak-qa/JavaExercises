package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageFirstClass {

    //POM'de farkli class'lara farkli sekilde ulasilmasii benimsenmistir
    //Driver class'i icin static yontemi kullaniyoruz
    //Page Class'lari icin ise obje uzerinden kullanlmasi tercih edilmistir


    @Test
    public void test01(){
        //Amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna Nutella yazip aratalim

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella" + Keys.ENTER);


        //arama sonuclarinin Nutella icerdigini test edelim
        String actualEndStr=amazonPage.resultWriteElement.getText();
        Assert.assertTrue(actualEndStr.contains("Nutella"));

        Driver.closeDriver();

    }

    @Test
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("java"+ Keys.ENTER);
        //sonucun java icerdigini test edelim
        String resultWriteStr=amazonPage.resultWriteElement.getText();
        Assert.assertTrue(resultWriteStr.contains("java"));
    }
}
