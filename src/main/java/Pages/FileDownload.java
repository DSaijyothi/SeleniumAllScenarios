package Pages;

import CommonMethods.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownload
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public FileDownload(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='File Download']")
    WebElement fileDownLoadURL;
    @FindBy(xpath = "//a[text()='testing_edge.pdf']")
    WebElement downloadFile;
    public void setFileDownLoadURL() throws InterruptedException {
        seleniumactions.clickOnElement(fileDownLoadURL);
        seleniumactions.Waits();
        seleniumactions.clickOnElement(downloadFile);
        seleniumactions.Waits();
        seleniumactions.setNavigation();
    }
}
