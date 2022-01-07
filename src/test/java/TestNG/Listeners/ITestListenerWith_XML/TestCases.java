package TestNG.Listeners.ITestListenerWith_XML;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    WebDriver driver;
    @BeforeTest
    public void beforeTest()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
    }

    @Test(priority = 0)
    public void Login()
    {

        driver.get("http://demo.guru99.com/V4/");
        //driver.findElement(By.name("uid")).sendKeys("mngr34926");
        driver.findElement(By.name("uid")).sendKeys("mngr377286");
        driver.findElement(By.name("password")).sendKeys("ydApAde");
        //driver.findElement(By.name("password")).sendKeys("amUpenu");
        driver.findElement(By.name("btnLogin")).click();
    }
    @Test(priority = 1)
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
