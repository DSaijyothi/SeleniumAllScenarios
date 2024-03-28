package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseAuth
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public BaseAuth(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='Basic Auth']")
    WebElement BaseAuth;
    @FindBy(xpath = "//*[@id='content']/div/p")
    WebElement congratsText;
    public void openBaseAuthUrl() throws InterruptedException {
        seleniumactions.clickOnElement(BaseAuth);
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
       System.out.println(congratsText.getText());
    }
    public String con()
    {
        return congratsText.getText();
    }
    public void snap() throws InterruptedException {
        seleniumactions.setNavigation();
        seleniumactions.setNavigation();
        Thread.sleep(10000);
    }
}
