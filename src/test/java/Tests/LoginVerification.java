package Tests;
import ExcelReading.ExcelUtils;
import JsonReading.JsonFileReading;
import Pages.ExpandLogin;
import Pages.LoginPage;
import TestLogin.LoginBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginVerification extends LoginBase {
    LoginPage loginpage;
    ExpandLogin expandlogin;

    @BeforeTest
    public void intialize() {
        loginpage = new LoginPage(driver);
        expandlogin=new ExpandLogin(driver);

    }

    @Test
    public void openLoginPage() throws InterruptedException {
        loginpage.setLoginCredentials();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return ExcelUtils.getTestData("C:\\Users\\Sai Jyothi\\IdeaProjects\\ReadData\\DataReading\\LoginCredentails.xlsx", "login");
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) throws InterruptedException {
        expandlogin.setCredentials(username, password);
    }
}
