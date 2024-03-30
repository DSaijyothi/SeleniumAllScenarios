package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpandLogin
{
    public WebDriver driver;
    public ExpandLogin(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(css = "[name='username']")
    WebElement UsernameBox;
    @FindBy(css="[name='password']")
    WebElement PasswordBox;
    @FindBy(css="[type='submit']")
    WebElement loginButton;
    public void setCredentials(String username, String password) throws InterruptedException {
     UsernameBox.sendKeys(username);
     PasswordBox.sendKeys(password);
     loginButton.click();
     Thread.sleep(5000);
    }
}
