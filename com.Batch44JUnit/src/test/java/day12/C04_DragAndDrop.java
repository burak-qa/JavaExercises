package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04_DragAndDrop extends TestBase {
    // Yeni bir class olusturalim: DragAndDrop

    @Test
    public void test01() throws InterruptedException {
        //1- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        //2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim

        Actions actions=new Actions(driver);
        WebElement dragMe=driver.findElement(By.id("draggable"));
        WebElement dropMe=driver.findElement(By.id("droppable"));

        actions.dragAndDrop(dragMe, dropMe).perform();

        //3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

        String actualDroppedWriting=dropMe.getText();
        String expectedDroppedWriting="Dropped!";

        Assert.assertEquals(actualDroppedWriting, expectedDroppedWriting);

        Thread.sleep(7000);
    }


}
