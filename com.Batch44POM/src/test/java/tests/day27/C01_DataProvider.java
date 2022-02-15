package tests.day27;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DataProvider {

    @DataProvider
    public static Object[][] searchWordList() {
        String search[][]={{"Nutella"},{"Java"}, {"Cucumber"}};

        return search;
    }

    @Test(dataProvider="searchWordList")
    public void amazonSearch(String search){
        //amazona gidip nutella icin arama yapalim
        //ve sonuclarin nutella icerdigini test edelim

        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(search + Keys.ENTER);
        Assert.assertTrue(amazonPage.resultWriteElement.getText().contains(search));
        Driver.closeDriver();
    }

}
