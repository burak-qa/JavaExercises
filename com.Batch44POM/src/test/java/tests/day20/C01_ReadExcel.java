package tests.day20;

import org.apache.poi.ss.usermodel.*;   //bunlar ayni sadece son kelimeler degisk * koyup digerlerni silebliriz
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void  test01() throws IOException {
        String path = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis =new FileInputStream(path);
        //Apachi POI depenceny yardimi ile bir Workbook olusturduk
        //Bu workbook bizim projemizin icerisinde ulkeler exelinin bir kopyasini kullanmamizi sagliyor
        //Exelin yapisi geregi bir hucreye(Cell) ulasabilmek icin workbookdan baslayarak
        //sirasi ile sheet, raw cell objeleri olusturmamiz gerekiyor
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1" );
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);

        System.out.println(cell); //Andorra   cunku index 0 dan basliyor

        //indexi 45 olan satirdaki, indexi 2 olan hucrenin Andorra oldugunu test ediniz
        String expectedData ="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);


        //5.indexdeki satirin, 3. indexdeki hucre bilgisini yazdiralim
        row=sheet.getRow(5);
        cell=row.getCell(3);

        System.out.println(cell);
    }

}
