package TestCases;

import org.testng.annotations.AfterTest;
 import Drivers.DriversPath;
 import Drivers.GetDriver;
 import org.openqa.selenium.By;
 import org.openqa.selenium.JavascriptExecutor;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.testng.annotations.AfterTest;
 import org.testng.annotations.BeforeSuite;
 import org.testng.annotations.Test;
 import java.util.ArrayList;
 import java.util.Set;

public class javascriptsExecutor
{
    WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty, DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
    }
    @Test
    public void windowhandlemethod1() throws InterruptedException {
        driver.get("https://www.google.com/search?q=facebook");

        //ALERT cixarmaq
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("alert('hello world');");

        //ELEMEMT CLICK
  /*      WebElement element = driver.findElement(By.xpath("//xpathimiz"));
        JavascriptExecutor js2 = (JavascriptExecutor)driver;
        js2.executeScript("arguments[0].click();", element);*/

        //REFRESH browser 2 yol
        //1:
        //  JavascriptExecutor js3 = (JavascriptExecutor)driver;
        //js3.executeScript("history.go(0)");
        //2:
        // Thread.sleep(9000);
        // ((JavascriptExecutor) driver).executeScript ("history.go(0)");

        //GET Title
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //  string sText =  js.executeScript("return document.title;").toString();


        //SCROLL
        // JavascriptExecutor js = (JavascriptExecutor)driver;
        //Vertical scroll - down by 150  pixels
        //js.executeScript("window.scrollBy(0,150)");
    }


    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
