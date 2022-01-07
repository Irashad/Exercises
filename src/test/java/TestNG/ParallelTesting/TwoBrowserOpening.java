package TestNG.ParallelTesting;
import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TwoBrowserOpening{
    /** Bu hissede parallel testing yox ikili browseri acmaqdan danisilir*/

    public static WebDriver driver;
    public static WebDriver driver2;

    @BeforeSuite
    public void before() throws InterruptedException {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
        driver2 = GetDriver.getChromeDriver();
    }
    @Test
    public void tc_twoBrowser()
    {
        driver.get("http://demo.guru99.com/V4/");
        driver2.get("http://guru99.com");

    }
    @AfterSuite
    public void afterTest(){System.out.println("Test Finished Successfully");
     //   driver.quit();
    }

}
