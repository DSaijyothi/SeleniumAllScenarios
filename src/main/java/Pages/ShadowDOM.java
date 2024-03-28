package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowDOM
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public ShadowDOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath="//a[text()='Shadow DOM']")
    WebElement shadowURL;
    @FindBy(xpath = "//h1[text()='Simple template']")
    WebElement simpleTemp;
    @FindBy(xpath = "//*[@id='content']/my-paragraph[1]/span")
    WebElement domText;
    public void verifyShadow() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        seleniumactions.clickOnElement(shadowURL);
        System.out.println(simpleTemp.getText());
        System.out.println(domText.getText());
        seleniumactions.setNavigation();
        seleniumactions.Waits();
    }
}
