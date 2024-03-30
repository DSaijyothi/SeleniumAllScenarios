package TestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LoginBase
{
    public WebDriver driver;
    @BeforeSuite
    public void launchApplication()
    {
      driver=new ChromeDriver();
    }
    @BeforeTest
    public void intializeBrowser() throws InterruptedException {
       driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }
    @AfterTest
    public void killSession()
    {
        driver.quit();
    }
}
