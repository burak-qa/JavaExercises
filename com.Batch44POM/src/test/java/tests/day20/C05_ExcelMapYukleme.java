package tests.day20;

import org.testng.annotations.Test;

public class C05_ExcelMapYukleme {
    @Test
    public void test01(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet'i map olarak kaydedin
        //reuseble bir method olusturalim


        String path ="src/test/resources/ulkeler.xlsx";
        String pageName= "Sayfa1";

        System.out.println(ReusableMethods.mapMake(path, pageName));
    }
}
