package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HorizontalSlider {
    public WebDriver driver;
    SeleniumActions seleniumactions;

    public HorizontalSlider(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        seleniumactions = new SeleniumActions(driver);
    }

    @FindBy(xpath = "//a[text()='Horizontal Slider']")
    WebElement horizontalURL;
    @FindBy(xpath = "//input[@type='range']")
    WebElement sliderBar;

    public void setHorizontalURL() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        seleniumactions.clickOnElement(horizontalURL);
        seleniumactions.Waits();
        for (int i = 0; i < 5; i++)
        {
            sliderBar.sendKeys(Keys.ARROW_RIGHT);
            seleniumactions.Waits();
        }

    }
    public void Navigation() throws InterruptedException {
        seleniumactions.setNavigation();
        seleniumactions.Waits();
    }
}