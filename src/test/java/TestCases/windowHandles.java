package TestCases;

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
import java.util.Set;

public class windowHandles {
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
        String facebookUrl = driver.findElement(By.xpath("(//a[contains(@href,'facebook.com')])[1]")).getAttribute("href");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        driver.switchTo().window(tabs.get(0));
        driver.get(facebookUrl);

    }
    @Test
    public void openLinkInNewTab() throws InterruptedException {
        driver.get("https://www.google.com/search?q=facebook");
        String facebookUrl = driver.findElement(By.xpath("(//a[contains(@href,'facebook.com')])[1]")).getAttribute("href");

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.open()");

        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        driver.get(facebookUrl);
        Thread.sleep(1000);
        driver.switchTo().window(tabs.get(0));
    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}