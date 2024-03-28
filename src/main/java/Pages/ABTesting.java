package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class ABTesting
{
    public WebDriver driver;
    public SeleniumActions seleniumactions;
    public ABTesting(WebDriver driver)
    {
     PageFactory.initElements(driver,this);
     this.driver=driver;
     seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath="//a[text()='A/B Testing']")
    WebElement abTestingURl;
    @FindBy(css="[id='content']")
    WebElement abtestingText;

    public void launchURL() throws InterruptedException {
        seleniumactions.clickOnElement(abTestingURl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(abtestingText.getText());
        Thread.sleep(3000);
        seleniumactions.setNavigation();
        Thread.sleep(3000);
    }
}
