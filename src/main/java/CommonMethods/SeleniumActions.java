package CommonMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumActions
{
    WebDriver driver;

    public SeleniumActions(WebDriver driver){
        this.driver = driver;

    }

    public boolean clickOnWebElementUsingText(String tag, String text){
        try {
            driver.findElement(By.xpath("//"+tag+"[text()='" + text + "']")).click();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean selectValueFromDropDown(WebElement element, String data, String typeSelect){
        try{
            Select select = new Select(element);
            switch (typeSelect){
                case "index":
                    select.selectByIndex(Integer.parseInt(data));
                    break;
                case "value":
                    select.selectByValue(data);
                    break;
                case "text":
                    select.selectByVisibleText(data);
                    break;
            }
            return true;
        }catch (Exception e){

            return false;
        }
    }

    public boolean clickOnElement(WebElement element) {
        boolean flag = false;
        try {
            element.click();
            flag = true;
        } catch (NoSuchElementException nse) {
            System.out.println(nse.toString());
            flag = false;
        } catch (StaleElementReferenceException see){
            System.out.println(see.toString());
            flag = false;
        } catch (ElementNotInteractableException eie){
            System.out.println(eie.toString());
            flag = false;
        }
        return flag;
    }

    public boolean enterValue(WebElement element, String data) {
        boolean flag = false;
        try {
            element.sendKeys(data);
            flag = true;
        } catch (NoSuchElementException nse) {
            System.out.println(nse.toString());
            flag = false;
        } catch (StaleElementReferenceException see){
            System.out.println(see.toString());
            flag = false;
        } catch (ElementNotInteractableException eie){
            System.out.println(eie.toString());
            flag = false;
        }
        return flag;
    }

    public boolean clickOnElement(By by){
        try{
            driver.findElement(by).click();
            return true;
        }catch (Exception e){

            return false;
        }
    }
    public void setNavigation()
    {
        driver.navigate().back();
    }
    public void Waits() throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Thread.sleep(5000);
    }
}


