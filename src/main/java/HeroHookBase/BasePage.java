package HeroHookBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import java.net.MalformedURLException;
import java.time.Duration;

public class BasePage
{
    public WebDriver driver;
    public static ExtentReports extent;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentTest test;
    @BeforeSuite
    public void launchBrowser()
    {

        driver=new ChromeDriver();
        extent = new ExtentReports();
        htmlReporter = new ExtentHtmlReporter("extent.html");
        extent.attachReporter(htmlReporter);
    }

    @BeforeTest
    public void intilaizeBrowsers() throws MalformedURLException {
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


    }

    @AfterTest
    public void killSession()
    {
        extent.flush();
        driver.quit();
    }
}
