package TestCases;
import Config.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle_Demo extends Base {

    @Test
    public void test() throws InterruptedException {
    //Launching the site.
        driver.get("http://demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
        Thread.sleep(2000);
        String MainWindow=driver.getWindowHandle();

    // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
            {
                String ChildWindow=i1.next();
        if(!MainWindow.equalsIgnoreCase(ChildWindow))
        {

            // Switching to Child window
            driver.switchTo().window(ChildWindow);
            driver.findElement(By.name("emailid"))
                    .sendKeys("gaurav.3n@gmail.com");
            Thread.sleep(2000);

            driver.findElement(By.name("btnLogin")).click();
            Thread.sleep(2000);

            // Closing the Child Window.

        }
    }
    // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);
}
}
