package Config;

import Drivers.DriversPath;
import Drivers.GetDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

    public static WebDriver driver;
    @BeforeSuite
    public void before()
    {
        System.setProperty(DriversPath.chromeProperty,DriversPath.chromePath);
        driver = GetDriver.getChromeDriver();
    }
    @AfterSuite
    public void afterTest(){System.out.println("Test Finished Successfully");
        driver.quit();
    }
}
