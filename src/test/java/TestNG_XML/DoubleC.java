package TestNG_XML;
import Drivers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleC {
    WebDriver driver;
    @BeforeTest
    public void beforet()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = new ChromeDriver();

    }
    @Test
    public void doubleclick() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        new Actions(driver).doubleClick(link).build().perform();
        ///Actions builder = new Actions(driver);
        //Action action =builder.doubleClick(link).build(); action.perform();
        //or
        // ---  Action action =builder.doubleClick(target WebElement).build();
        driver.switchTo().alert().accept();
        Assert.assertTrue(true);
        Thread.sleep(3000);


    }
    @AfterTest
    public void afterTest()
    {

    }

}
