package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {
    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//div[@class='rt-tr']")
    public WebElement headerLineElement;

    @FindBy(xpath ="//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public WebElement headersWebelementList;

    @FindBy(xpath ="//div[@class='rt-tbody']")
    public WebElement bodyTekWebelement;

    @FindBy(xpath ="//div[@class='rt-td']")
    public List<WebElement> allDataWebelementList;

    @FindBy(xpath ="//div[@class='rt-tr-group']")
    public List<WebElement> allLineWebelementList;

    public void columnWrite (int column){
        //((//div[@class='rt-tr-group'])[3]//div[@class='rt-td'])[4]

        int lineNumber=allLineWebelementList.size();
        String dinamikXpath;
        WebElement temporaryElement;
        System.out.println(headersWebelementList.get(column-1).getText());

        for(int i=1 ; i<=lineNumber ; i++){
            dinamikXpath="((//div[@class='rt-tr-group'])[\"+i+\"]//div[@class='rt-td'])[\"+column+\"]";
            temporaryElement=Driver.getDriver().findElement(By.xpath(dinamikXpath));
            System.out.println(temporaryElement.getText());

        }

    }

    public void writeSalaryFromName(String name) {
        int lineNumber=allLineWebelementList.size();
        String dinamikXpath;
        String lineName;
        String salary;

        for (int i=1 ; i<lineNumber ; i++){
            dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+1+"]";
            lineName=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            dinamikXpath="((//div[@class='rt-tr-group'])["+i+"]//div[@class='rt-td'])["+5+"]";
            salary=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();



            if (lineName.equals(name)){
                System.out.println(salary);
            }
        }

    }

    public void writeCell(int line, int column) {
        String dinamikXpath="((//div[@class='rt-tr-group'])["+line+"]//div[@class='rt-td'])["+column+"]";
        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());

    }
}
