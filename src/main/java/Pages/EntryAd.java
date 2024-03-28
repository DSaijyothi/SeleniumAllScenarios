package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAd
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public EntryAd(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='Entry Ad']")
    WebElement entryAdURL;
    @FindBy(xpath = "//a[text()='click here']")
    WebElement clickHereButton;
    @FindBy(css="#modal > div.modal > div.modal-body > p")
    WebElement addText;
    @FindBy(css="#modal > div.modal > div.modal-footer > p")
    WebElement closeButton;
    public void setEntryAdURL() throws InterruptedException {
        seleniumactions.clickOnElement(entryAdURL);
        seleniumactions.clickOnElement(clickHereButton);
        seleniumactions.Waits();
        System.out.println(addText.getText());

    }
    public String addContent()
    {
        return addText.getText();
    }
    public void Buttons() throws InterruptedException {
        seleniumactions.clickOnElement(closeButton);
        seleniumactions.Waits();
        seleniumactions.setNavigation();
        seleniumactions.Waits();
    }
}
