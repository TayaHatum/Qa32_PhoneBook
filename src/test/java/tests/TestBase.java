package tests;

import manager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected  static ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp(){
        app.init();


    }

    @AfterMethod
    public void tearDown(){
      app.stop();
    }

   ///********************************************************



    public void type(By locator, String text){
        if(text!=null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }

    public void click(By locator){
        wd.findElement(locator).click();

    }
    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }


}
