package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {
    @Test
    public void test01() throws IOException {
        //ulkeler exeline 5. sutun olarak NUFUS sutunu ekleyelim
        //3. satirdaki ulkenin nufusunu 10000000 yapalim


        //1-dosyaya ulasalim
        String path="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        //2-class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
        Workbook workbook= WorkbookFactory.create(fis);
        //3-dosyada yapmak istedigimiz degisikleri
        //ilk satirin 5. hucresine NUfus basligini yazdiralim
        //ilk satirin 5. hucresine NUFUS basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        //3. satirdaki ulkenin nufusunu 10000000 yapalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("10000000");

        //4-kopyada yaptigmiz degisiklikleri ana dosyaya kayit edelim

        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
    }
}
