package HeroHookTests;
import HeroHookBase.BasePage;
import Pages.*;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeroHook extends BasePage
{
    ABTesting abTesting;
    AddorRemoveElements removeElements;
    ChallengingDOM dom;
    Dropdowns downs;
    BaseAuth auth;
    ShadowDOM shadowdom;
    EntryAd entryad;
    HorizontalSlider horizontalslider;
    FileUpload upload;
    FileDownload download;


    @BeforeTest
    public void Intialize()
    {
        abTesting=new ABTesting(driver);
        removeElements=new AddorRemoveElements(driver);
        dom=new ChallengingDOM(driver);
        downs=new Dropdowns(driver);
        auth=new BaseAuth(driver);
        shadowdom=new ShadowDOM(driver);
        entryad=new EntryAd(driver);
        horizontalslider=new HorizontalSlider(driver);
        upload=new FileUpload(driver);
        download=new FileDownload(driver);

    }
    @Test
    public void openabApplication() throws InterruptedException {
        String Title=driver.getTitle();
        System.out.println(Title);
        String ExpectedTitle="The Internet";
        String ActualTitle="The Internet";
        Assert.assertEquals(ExpectedTitle,ActualTitle,"Wrong Title");
        System.out.println(ExpectedTitle+ActualTitle);
        abTesting.launchURL();
        test = extent.createTest("ABTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openremoveElements() throws InterruptedException {
        removeElements.openRemoveElements();
        String ExpectedText=removeElements.Verify();
        String ActualText="Add/Remove Elements";
        Assert.assertEquals(ExpectedText,ActualText,"TitleMismatch");
        System.out.println(ExpectedText + ActualText);
        removeElements.quitcurrentPage();
        test = extent.createTest("RemoveElementsTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openChallengingDOM() throws InterruptedException {
        dom.openDomURL();
      String ExpectedText= dom.DOMText();
      String ActualText="Challenging DOM";
        Assert.assertEquals(ExpectedText,ActualText,"Text mismatch");
        System.out.println(ExpectedText);
        System.out.println(ActualText);
       dom.navigation();
        test = extent.createTest("ChallengingDOMTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void opendropdowns() throws InterruptedException {
        downs.verifyDropdown();

    }
    @Test
    public void openBaseAuth() throws InterruptedException {
        auth.openBaseAuthUrl();
       String ExpectedText= auth.con();
       String ActualText="Congratulations! You must have the proper credentials.";
       Assert.assertEquals(ExpectedText,ActualText,"Text Mistach");
       System.out.println(ExpectedText);
       auth.snap();
        test = extent.createTest("BaseAuthTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");

    }
    @Test
    public void openShadowDOM() throws InterruptedException {
        shadowdom.verifyShadow();
        test = extent.createTest("ShadowDOMTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openEntryAD() throws InterruptedException {
        entryad.setEntryAdURL();
        String expectedContent=entryad.addContent();
        String actualContent="It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).";
        Assert.assertEquals(expectedContent,actualContent,"ContentMismatch");
        System.out.println(expectedContent);
        entryad.Buttons();
        test = extent.createTest("EntryADTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openHorizontalSlider() throws InterruptedException {
        horizontalslider.setHorizontalURL();
        horizontalslider.Navigation();
        test = extent.createTest("HorizonatalSliderTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openFileUpload() throws InterruptedException {
        upload.setFileUploadURL();
        test = extent.createTest("FileUploadTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
    @Test
    public void openFileDownload() throws InterruptedException {
        download.setFileDownLoadURL();
        test = extent.createTest("FileDownloadTesting");
        test.log(Status.INFO, "Test Started");
        test.log(Status.PASS, "Test Passed");
    }
}
