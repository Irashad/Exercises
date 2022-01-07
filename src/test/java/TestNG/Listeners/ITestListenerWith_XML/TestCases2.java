package TestNG.Listeners.ITestListenerWith_XML;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestCases2 {
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
        Assert.assertTrue(true);
    }
    @Test(priority = 1)
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
