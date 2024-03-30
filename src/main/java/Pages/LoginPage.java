package Pages;

import JsonReading.JsonFileReading;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class LoginPage
{
    public WebDriver driver;
    public  LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(css="[name='username']")
    WebElement loginBox;
    @FindBy(css="[name='password']")
    WebElement passwordBox;
    @FindBy(id="submit")
    WebElement loginButton;
    public void setLoginCredentials() throws InterruptedException {
        Map<String, String> jsonData = JsonFileReading.readJsonData("C:\\Users\\Sai Jyothi\\IdeaProjects\\ReadData\\DataReading\\LoginData.json");
        if (jsonData != null) {
            String username = jsonData.get("username");
            String password = jsonData.get("password");
            loginBox.sendKeys(username);
            Thread.sleep(5000);
            passwordBox.sendKeys(password);
            loginButton.click();
            Thread.sleep(5000);
        } else {
            System.out.println("Failed to read JSON data.");
        }
        System.out.println("Hi Login Secussfull");
    }

}
