package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class ChallengingDOM
{
    public WebDriver driver;
    SeleniumActions seleniumactions;

    public ChallengingDOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='Challenging DOM']")
    WebElement DOMURL;
    @FindBy(xpath = "//h3[text()='Challenging DOM']")
    WebElement Domtext;
    @FindBy(css = "[class='button']")
    WebElement Button;
    public void openDomURL() throws InterruptedException {
        seleniumactions.clickOnElement(DOMURL);
        seleniumactions.clickOnElement(Button);
        Thread.sleep(3000);
    }
    public String DOMText()
    {
        return Domtext.getText();
    }
    public void navigation() throws InterruptedException {
       seleniumactions.setNavigation();
       Thread.sleep(3000);
    }

}
