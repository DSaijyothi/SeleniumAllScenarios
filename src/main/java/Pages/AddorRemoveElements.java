package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class AddorRemoveElements {
    public WebDriver driver;
    SeleniumActions seleniumactions;

    public AddorRemoveElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        seleniumactions = new SeleniumActions(driver);
    }

    @FindBy(xpath = "//a[text()='Add/Remove Elements']")
    WebElement removeElements;
    @FindBy(xpath = "//h3[text()='Add/Remove Elements']")
    WebElement Verification;
    @FindBy(xpath = "//button[text()='Add Element']")
    WebElement addElementButton;
    @FindBy(xpath = "//button[text()='Delete']")
    WebElement deleteButton;
    public void openRemoveElements() throws InterruptedException {
        seleniumactions.clickOnElement(removeElements);
        seleniumactions.clickOnElement(addElementButton);
        seleniumactions.clickOnElement(addElementButton);
        seleniumactions.clickOnElement(deleteButton);
        seleniumactions.clickOnElement(deleteButton);
        Thread.sleep(3000);
    }
    public String Verify()
    {
        return Verification.getText();

    }
    public void quitcurrentPage()
    {
      seleniumactions.setNavigation();
    }
}

