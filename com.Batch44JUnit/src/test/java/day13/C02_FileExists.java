package day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExists extends TestBase {

    @Test
    public void  test01(){

        System.out.println(System.getProperty("user.home"));

        //masa ustundeki deneme klasorunun path ini istesem
        //C:\Users\Gebruiker\Desktop\Deneme\selenium.xlsx

        //yani dinamk olarak masa ustundeki deneme kasorunun path ini yazmak iistersem

        String path=System.getProperty("user.home")+"\\Desktop\\Deneme\\selenium.xlsx";

        System.out.println(path);
        System.out.println("user.dir : "+System.getProperty("user.dir"));

        //masaustunde Deneme klasoru icerisinde selenium.xlsx isminde bir dosya oldugunu test edin

        //1- once bu dosyaya ulasmak cin gerekli dinamik path olusturalim

        String dosyaYolu= System.getProperty("user.home")+"\\Desktop\\Deneme\\selenium.xlsx";
        System.out.println(Files.exists(Paths.get(dosyaYolu)));

        //projemizde pom.xml oldugunu test edin
        //C:\Users\Gebruiker\Desktop\TechPro Ed\com.Batch44JUnit\pom.xml


        System.out.println(System.getProperty("user.dir")); //projemin yolunu verir

        String pomPath=System.getProperty("user.dir")+ "\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(pomPath)));
    }
}








