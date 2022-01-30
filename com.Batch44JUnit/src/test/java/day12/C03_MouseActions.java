package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_MouseActions extends TestBase {
    //1- Yeni bir class olusturalim: MouseActions

    @Test
    public void test01() throws InterruptedException {
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim

        driver.get("https://the-internet.herokuapp.com/context_menu ");

        //3- Cizili alan uzerinde sag click yapalim

        Actions actions=new Actions(driver);
        WebElement drawingAreaElement=driver.findElement(By.id("hot-spot"));
        actions.contextClick(drawingAreaElement).perform();
        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
        //    test edelim.
    String expectedWriting="You selected a context menu";
    String actualWriting=driver.switchTo().alert().getText();

    Assert.assertEquals(expectedWriting, actualWriting);
        //5- Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        //6- Elemental Selenium linkine tiklayalim

        String firstPageHandleValue=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim

        String secondPageHandleValue ="";
        Set<String> handleSet=driver.getWindowHandles();

        for (String each: handleSet){
            if(!each.equals(firstPageHandleValue)){
                secondPageHandleValue =each;
            }
        }
        driver.switchTo().window(secondPageHandleValue);

        WebElement secondPageWriteElement = driver.findElement(By.tagName("h1"));
        String actualSecondPageWrite=secondPageWriteElement.getText();
        String expectedSecondPageWriting="Elemental Selenium";

        Assert.assertEquals(expectedSecondPageWriting, actualSecondPageWrite);


    }
}
