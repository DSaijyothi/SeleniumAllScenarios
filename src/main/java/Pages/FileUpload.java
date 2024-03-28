package Pages;

import CommonMethods.SeleniumActions;
import org.apache.hc.core5.net.WWWFormCodec;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUpload
{
    public WebDriver driver;
    SeleniumActions seleniumactions;
    public FileUpload(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
        seleniumactions=new SeleniumActions(driver);
    }
    @FindBy(xpath = "//a[text()='File Upload']")
    WebElement fileUploadURL;
    @FindBy(xpath = "//input[@id='file-upload']")
    WebElement uploadButton;
    @FindBy(id="file-submit")
    WebElement fileSubmit;

    public void setFileUploadURL() throws InterruptedException {
        seleniumactions.clickOnElement(fileUploadURL);
        seleniumactions.Waits();
        String filePath = "C:\\Users\\Sai Jyothi\\Downloads\\Selenium";
        uploadButton.sendKeys(filePath);
        seleniumactions.Waits();
        seleniumactions.clickOnElement(fileSubmit);
        seleniumactions.Waits();
        seleniumactions.setNavigation();
        seleniumactions.Waits();
    }

}
