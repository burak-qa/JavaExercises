package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//button[@title='Alle cookies toestaan']")
    public WebElement facebookCookies;

    @FindBy(name="email")
    public WebElement emailBox;

    @FindBy(id="pass")
    public WebElement passBox;

    @FindBy(name="login")
    public WebElement loginButtonu;

    @FindBy(name="_9ay7")
    public WebElement errorWriteElement;
}
