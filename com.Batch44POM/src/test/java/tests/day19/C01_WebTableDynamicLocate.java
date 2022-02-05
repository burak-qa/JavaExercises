package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDynamicLocate {
    //3 Test method'u olusturalim

    //2.Method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    //3. sutun numarasi verdigimde bana tum sutunu yazdirsin

     HMCWebTablePage hmcWebTablePage;
     HotelMyCampPage hotelMyCampPage;
    @Test
    public void writeLineTest(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.enterDo();
        // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir  //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        WebElement thirdLineElement=hmcWebTablePage.lineGet(4);

        System.out.println(thirdLineElement.getText());

        Driver.closeDriver();
    }

    @Test
    public void cellGetTest(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.enterDo();
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredeki element : "+hmcWebTablePage.cellWebelementGet(5,3));
        Driver.closeDriver();
    }

    @Test
    public void writeColumnTest(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.enterDo();
        // 3. sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.columnWrite(4);

        Driver.closeDriver();
    }
}
