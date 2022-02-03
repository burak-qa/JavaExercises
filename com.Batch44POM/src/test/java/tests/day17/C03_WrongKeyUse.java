package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_WrongKeyUse {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCurl")); //burada u harfini bilerek yanlis yazdik

        //eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        //Cnfigreader.getProperty() o key'i bulamaz
        //ve nullPointerExeption firlatir
    }
}
