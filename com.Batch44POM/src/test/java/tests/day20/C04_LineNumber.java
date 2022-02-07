package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_LineNumber {
    @Test
    public void test01() throws IOException {
        //ulkelr excelindeki Sayfa1 ve Sayfa2'deki satir sayilarini
        //ve kullanilan satir sayilarini bulun

        String path = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int page1LineNumber=workbook.getSheet("Sayfa1").getLastRowNum();
        int page1RealUseLineNumber= workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();

        System.out.println("1. sayfa satir saytisi :" + page1LineNumber);
        System.out.println(("1.sayfa fiziki kullanilan satr sayisi:" +page1RealUseLineNumber));

        System.out.println("*************2.Sayfa*****************");

    }

    @Test
    public void test02() throws IOException {
        //ulkelr excelindeki Sayfa1 ve Sayfa2'deki satir sayilarini
        //ve kullanilan satir sayilarini bulun

        String path = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        int page2LineNumber=workbook.getSheet("Sayfa2").getLastRowNum();
        int page2RealUseLineNumber= workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();

        System.out.println("2. sayfa satir saytisi :" + page2LineNumber);
        System.out.println(("2.sayfa fiziki kullanilan satr sayisi:" +page2RealUseLineNumber));



    }
}
