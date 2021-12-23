package compro;

import Drivers.DriversPath;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class guru99 {
    WebDriver driver;
    WebDriverWait wait;
    WebElement dropdwnElement;
    WebElement email;
    WebElement password;
    @BeforeSuite
    public void before()
    {

        System.setProperty("webdriver.chrome.driver", DriversPath.chromePath );
        driver = new ChromeDriver();
    }
    @Test
    public void testcase1() throws InterruptedException {
        String title=driver.getTitle();
       // driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.get("https://output.jsbin.com/osebed/2");
        Thread.sleep(3000);
        dropdwnElement= driver.findElement(By.id("fruits"));
        Select dropdwn = new Select(dropdwnElement);
        Assert.assertTrue(dropdwn.isMultiple());






    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}

}
