package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdowns
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public Dropdowns(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropDownURl;
    @FindBy(xpath = "//h3[text()='Dropdown List']")
    WebElement dropDowntext;
    @FindBy(css="[id='dropdown']")
    WebElement dropdownBox;
    public void verifyDropdown() throws InterruptedException {
      seleniumactions.clickOnElement(dropDownURl);
      seleniumactions.Waits();
      System.out.println(dropDowntext.getText());
      seleniumactions.selectValueFromDropDown(dropdownBox,"2","value");
      seleniumactions.setNavigation();
      seleniumactions.Waits();


    }
}
